package com.zifer.zeroproject.service;

import java.util.List;

import javax.annotation.Resource;

import com.zifer.zeroproject.model.AnswerModel;


@Resource(name = "answerService")
public interface AnswerService {
	
	public abstract AnswerModel addAnswer(AnswerModel AnswerModel);
	
	public AnswerModel getAnswer(int ID_ANSWER);

	public abstract List<AnswerModel> listAllAnswer();

}
