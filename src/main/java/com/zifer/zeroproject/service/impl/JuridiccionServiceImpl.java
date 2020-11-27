package com.zifer.zeroproject.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zifer.zeroproject.component.JuridiccionConverter;
import com.zifer.zeroproject.entity.Juridiccion;
import com.zifer.zeroproject.model.JuridiccionModel;
import com.zifer.zeroproject.repository.JuridiccionRepository;
import com.zifer.zeroproject.service.JuridiccionService;



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
