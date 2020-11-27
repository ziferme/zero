package com.jlm.juridiccion.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jlm.juridiccion.constant.ViewConstant;
import com.jlm.juridiccion.model.JuridiccionModel;
import com.jlm.juridiccion.service.JuridiccionService;


@Controller
public class JuridiccionController {
	
	@Autowired
	@Qualifier("juridiccionServiceImpl")
	private JuridiccionService juridiccionService;
	
	@GetMapping("/juridiccion")
	public ModelAndView getJuridiccion(@RequestParam(name="ID_JURISDICCION_ALTO_RIESGO", required= false) Integer ID_JURISDICCION_ALTO_RIESGO){
		ModelAndView mav = new ModelAndView("juridiccion");
		
		if(ID_JURISDICCION_ALTO_RIESGO == null) {
			ID_JURISDICCION_ALTO_RIESGO = 1;
		}
		mav.addObject("juridiccions", juridiccionService.listAllJuridiccion());
		mav.addObject("juri_uni", juridiccionService.getJuridiccion(ID_JURISDICCION_ALTO_RIESGO));
		return mav;
	}
	
	@GetMapping("/removecontact")
	public ModelAndView removeJuridiccion(@RequestParam(name="ID_JURISDICCION_ALTO_RIESGO", required= true) Integer ID_JURISDICCION_ALTO_RIESGO) {
		    int nullo=1;
			juridiccionService.removeJuridiccion(ID_JURISDICCION_ALTO_RIESGO);
			return getJuridiccion(nullo);
	}
	
	
	@PostMapping("/update-juridiccion")
	public String updateJuridiccion(@ModelAttribute(name="juri_uni") JuridiccionModel juridiccionModel) {
		//
		System.out.println("--------------------------"+juridiccionModel.ID_JURISDICCION_ALTO_RIESGO);
		System.out.println("--------------------------"+juridiccionModel.JURISDICCION_ALTO_RIESGO);
		System.out.println("--------------------------"+juridiccionModel.ESTATUS);
		juridiccionService.updateJuridiccionBy(juridiccionModel.JURISDICCION_ALTO_RIESGO, juridiccionModel.ESTATUS, juridiccionModel.ID_JURISDICCION_ALTO_RIESGO);
		return "redirect:/juridiccion";
	}
	


}
