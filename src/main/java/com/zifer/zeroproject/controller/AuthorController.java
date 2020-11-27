package com.zifer.zeroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zifer.zeroproject.service.AuthorService;



@Controller
public class AuthorController {
	
	@Autowired
	@Qualifier("authorServiceImpl")
	private AuthorService authorService;
	
	@GetMapping("/author")
	public ModelAndView getAuthor(@RequestParam(name="ID_AUTHOR", required= false) Integer ID_AUTHOR){
		ModelAndView mav = new ModelAndView("author");
		
		if(ID_AUTHOR == null) {
			ID_AUTHOR = 1;
		}
		mav.addObject("authors", authorService.listAllAuthor());
		mav.addObject("author_uni", authorService.getAuthor(ID_AUTHOR));
		return mav;
	}
	

	
/*	
	@GetMapping("/removecontact")
	public ModelAndView removeAuthor(@RequestParam(name="ID_JURISDICCION_ALTO_RIESGO", required= true) Integer ID_JURISDICCION_ALTO_RIESGO) {
		    int nullo=1;
		    authorService.removeAuthor(ID_JURISDICCION_ALTO_RIESGO);
			return getAuthor(nullo);
	}
	
	@PostMapping("/update-juridiccion")
	public String updateAuthor(@ModelAttribute(name="juri_uni") AuthorModel authorModel) {
		//

		authorService.updateAuthorBy(authorModel.JURISDICCION_ALTO_RIESGO, authorModel.ESTATUS, authorModel.ID_JURISDICCION_ALTO_RIESGO);
		return "redirect:/juridiccion";
	}*/

}
