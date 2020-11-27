package com.zifer.zeroproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zifer.zeroproject.component.LanguageConverter;
import com.zifer.zeroproject.entity.Language;

import com.zifer.zeroproject.model.LanguageModel;
import com.zifer.zeroproject.repository.LanguageRepository;
import com.zifer.zeroproject.service.LanguageService;



@Service("languageServiceImpl")
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	@Qualifier("languageConverter")
	private LanguageConverter languageConverter;
	
	@Autowired
	@Qualifier("languageRepository")
	private LanguageRepository languageRepository;

	@Override
	public LanguageModel addLanguage(LanguageModel LanguageModel) {
		
		return null;
	}

	@Override
	public LanguageModel getLanguage(int ID_LANGUAGE) {
		Language languageEntity = languageRepository.findLanguageBy(ID_LANGUAGE);
		
		LanguageModel languageModel = new LanguageModel();
		languageModel = languageConverter.convertLanguage2Language2Model(languageEntity);
	    
		
		return languageModel;
	}

	@Override
	public List<LanguageModel> listAllLanguage() {
		// TODO Auto-generated method stub
		return null;
	}




}
