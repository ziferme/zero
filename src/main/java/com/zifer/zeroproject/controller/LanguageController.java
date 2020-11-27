package com.zifer.zeroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.zifer.zeroproject.service.LanguageService;

@Controller
public class LanguageController {
	
	@Autowired
	@Qualifier("languageServiceImpl")
	private LanguageService languageService;
	
	@GetMapping("/language")
	public ModelAndView getJuridiccion(@RequestParam(name="ID_LANGUAGE", required= false) Integer ID_LANGUAGE){
		ModelAndView mav = new ModelAndView("language");
		
		if(ID_LANGUAGE == null) {
			ID_LANGUAGE = 1;
		}
		mav.addObject("languages", languageService.listAllLanguage());
		mav.addObject("language_uni", languageService.getLanguage(ID_LANGUAGE));
		return mav;
	}
	
	/*@GetMapping("/removecontact")
	public ModelAndView removeJuridiccion(@RequestParam(name="ID_JURISDICCION_ALTO_RIESGO", required= true) Integer ID_JURISDICCION_ALTO_RIESGO) {
		    int nullo=1;
		    languageService.removelanguage(ID_JURISDICCION_ALTO_RIESGO);
			return getlanguage(nullo);
	}
	
	
	@PostMapping("/update-juridiccion")
	public String updateJuridiccion(@ModelAttribute(name="juri_uni") JuridiccionModel juridiccionModel) {
		//
		System.out.println("--------------------------"+juridiccionModel.ID_JURISDICCION_ALTO_RIESGO);
		System.out.println("--------------------------"+juridiccionModel.JURISDICCION_ALTO_RIESGO);
		System.out.println("--------------------------"+juridiccionModel.ESTATUS);
		juridiccionService.updateJuridiccionBy(juridiccionModel.JURISDICCION_ALTO_RIESGO, juridiccionModel.ESTATUS, juridiccionModel.ID_JURISDICCION_ALTO_RIESGO);
		return "redirect:/juridiccion";
	}*/
	

}
