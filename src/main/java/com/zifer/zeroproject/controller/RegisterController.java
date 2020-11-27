package com.zifer.zeroproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@GetMapping("/register")
	public ModelAndView getAuthor( ){
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

}
