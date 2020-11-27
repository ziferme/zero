package com.zifer.zeroproject.service;

import java.util.List;

import com.zifer.zeroproject.model.QuestionModel;


public interface QuestionService {

	public abstract QuestionModel addQuestion(QuestionModel QuestionModel);
	
	public QuestionModel getQuestion(int ID_QUESTION);

	public abstract List<QuestionModel> listAllQuestion();
}
