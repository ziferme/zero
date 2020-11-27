package com.zifer.zeroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zifer.zeroproject.service.TransactionService;

@Controller
public class TransactionController {
	

	@Autowired
	@Qualifier("transactionServiceImpl")
	private TransactionService transactionService;
	
	@GetMapping("/transaction")
	public ModelAndView getTransaction(@RequestParam(name="ID_TRANSACTION", required= false) Integer ID_TRANSACTION){
		ModelAndView mav = new ModelAndView("transaction");
		
		if(ID_TRANSACTION == null) {
			ID_TRANSACTION = 1;
		}

		System.out.println("--------------------------"+mav.getViewName());
		mav.addObject("transactions", transactionService.listAllTransaction());
		mav.addObject("transaction_uni", transactionService.getTransaction(ID_TRANSACTION));
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
