package com.jlm.juridiccion.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jlm.juridiccion.component.JuridiccionConverter;
import com.jlm.juridiccion.entity.Juridiccion;
import com.jlm.juridiccion.model.JuridiccionModel;
import com.jlm.juridiccion.repository.JuridiccionRepository;
import com.jlm.juridiccion.service.JuridiccionService;



@Service("juridiccionServiceImpl")
public class JuridiccionServiceImpl implements JuridiccionService{
	

	
	@Autowired
	@Qualifier("juridiccionConverter")
	private JuridiccionConverter juridiccionConverter;
	
	@Autowired
	@Qualifier("juridiccionRepository")
	private JuridiccionRepository juridiccionRepository;

	@Override
	public JuridiccionModel addJuridiccion(JuridiccionModel JuridiccionModel) {
		
		return null;
	}

	@Override
	public JuridiccionModel getJuridiccion(int ID_JURISDICCION_ALTO_RIESGO) {
		Juridiccion juridiccionEntity = juridiccionRepository.findJuridiccionBy(ID_JURISDICCION_ALTO_RIESGO);
		
		JuridiccionModel juridiccionModel = new JuridiccionModel();
		juridiccionModel = juridiccionConverter.convertJuridiccion2Juridiccion2Model(juridiccionEntity);
	    
		
		return juridiccionModel;
	}

	@Override
	public List<JuridiccionModel> listAllJuridiccion() {
		// TODO Auto-generated method stub
				List<Juridiccion> juridiccions = juridiccionRepository.findAll();
				List<JuridiccionModel> juridicionModel = new ArrayList<JuridiccionModel>();
				for (Juridiccion juridiccion : juridiccions) {
					juridicionModel.add(juridiccionConverter.convertJuridiccion2Juridiccion2Model(juridiccion));
				}
				return juridicionModel;
	}

	@Override
	public void removeJuridiccion(int ID_JURISDICCION_ALTO_RIESGO) {
		juridiccionRepository.removeJuridiccion(ID_JURISDICCION_ALTO_RIESGO);
		
	}

	@Override
	public void updateJuridiccionBy(String JURISDICCION_ALTO_RIESGO, String ESTATUS, int ID_JURISDICCION_ALTO_RIESGO) {
		juridiccionRepository.updateJuridiccionBy(JURISDICCION_ALTO_RIESGO, ESTATUS, ID_JURISDICCION_ALTO_RIESGO);
	}



}
