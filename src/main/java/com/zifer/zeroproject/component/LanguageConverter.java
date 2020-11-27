package com.zifer.zeroproject.component;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.zifer.zeroproject.entity.Language;
import com.zifer.zeroproject.model.LanguageModel;

@Component("languageConverter")
public class LanguageConverter {
	
	
	public Language convert2LanguageModel2Language(LanguageModel languageModel) {
		Language language = new Language();

		language.setID_LANGUAGE(languageModel.ID_LANGUAGE);
		language.setLANGUAGE(languageModel.LANGUAGE);
		language.setDESCRIPTION(languageModel.DESCRIPTION);

		return language;
	}
	
	public LanguageModel convertLanguage2Language2Model(Language language) {
		LanguageModel languageModel = new LanguageModel();
		
		languageModel.setID_LANGUAGE(language.ID_LANGUAGE);
		languageModel.setLANGUAGE(language.LANGUAGE);
		languageModel.setDESCRIPTION(language.DESCRIPTION);

		return languageModel;
	}

}
