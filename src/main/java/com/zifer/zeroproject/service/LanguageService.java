package com.zifer.zeroproject.service;

import java.util.List;


import com.zifer.zeroproject.model.LanguageModel;

public interface LanguageService {
	
	public abstract LanguageModel addLanguage(LanguageModel LanguageModel);
	
	public LanguageModel getLanguage(int ID_LANGUAGE);

	public abstract List<LanguageModel> listAllLanguage();

}
