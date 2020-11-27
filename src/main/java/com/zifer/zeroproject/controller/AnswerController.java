package com.zifer.zeroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zifer.zeroproject.service.AnswerService;
import com.zifer.zeroproject.model.AnswerModel;


@Controller
public class AnswerController {
	
	@Autowired
	@Qualifier("answerServiceImpl")
	private AnswerService answerService;
	
	
	@GetMapping("/answer")
	public ModelAndView getAnswer(@RequestParam(name="ID_ANSWER", required= false) Integer ID_ANSWER){
		ModelAndView mav = new ModelAndView("answer");
		AnswerModel modelo = new AnswerModel();
		
		
		if(ID_ANSWER == null) {
			ID_ANSWER = 1;
		}
		

		mav.addObject("answers", answerService.listAllAnswer());
		mav.addObject("answer_uni", answerService.getAnswer(ID_ANSWER));
		return mav;
	}

}
