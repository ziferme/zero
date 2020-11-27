package com.zifer.zeroproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zifer.zeroproject.component.QuestionConverter;
import com.zifer.zeroproject.entity.Language;
import com.zifer.zeroproject.entity.Question;
import com.zifer.zeroproject.model.LanguageModel;
import com.zifer.zeroproject.model.QuestionModel;
import com.zifer.zeroproject.repository.QuestionRepository;
import com.zifer.zeroproject.service.QuestionService;

@Service("questionServiceImpl")
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	@Qualifier("questionConverter")
	private QuestionConverter questionConverter;
	
	@Autowired
	@Qualifier("questionRepository")
	private QuestionRepository questionRepository;

	@Override
	public QuestionModel addQuestion(QuestionModel QuestionModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionModel getQuestion(int ID_QUESTION) {
		Question questionEntity = questionRepository.findQuestionBy(ID_QUESTION);
		System.out.print("************************$$"+questionEntity.ID_QUESTION+"$$");
		QuestionModel questionModel = new QuestionModel();
		questionModel = questionConverter.convertQuestion2Question2Model(questionEntity);
	    
		
		return questionModel;
	}

	@Override
	public List<QuestionModel> listAllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
