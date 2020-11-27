package com.zifer.zeroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.zifer.zeroproject.service.QuestionService;
import com.zifer.zeroproject.model.QuestionModel;

@Controller
public class QuestionController {


	
	@Autowired
	@Qualifier("questionServiceImpl")
	private QuestionService questionService;
	
	@GetMapping("/question")
	public ModelAndView getQuestion(@RequestParam(name="ID_QUESTION", required= false) Integer ID_QUESTION){
		ModelAndView mav = new ModelAndView("question");
		
		if(ID_QUESTION == null) {
			ID_QUESTION = 1;
		}

		System.out.println("--------------------------"+mav.getViewName());
		mav.addObject("questions", questionService.listAllQuestion());
		mav.addObject("question_uni", questionService.getQuestion(ID_QUESTION));
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
