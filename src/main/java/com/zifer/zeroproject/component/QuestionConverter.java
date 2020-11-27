package com.zifer.zeroproject.component;

import org.springframework.stereotype.Component;


import com.zifer.zeroproject.entity.Question;
import com.zifer.zeroproject.model.QuestionModel;

@Component("questionConverter")
public class QuestionConverter {
	
	public Question convert2QuestionModel2Question(QuestionModel questionModel) {
		Question question = new Question();
		
		question.setID_QUESTION(questionModel.ID_QUESTION);
		question.setID_AUTHOR(questionModel.ID_AUTHOR);
		question.setTITTLE(questionModel.TITTLE);
		question.setCONTENT_QUESTION(questionModel.CONTENT_QUESTION);
		question.setIMG1_QUESTION(questionModel.IMG1_QUESTION);
		question.setIMG2_QUESTION(questionModel.IMG2_QUESTION);
		question.setIMG3_QUESTION(questionModel.IMG3_QUESTION);
		question.setLOG_QUESTION(questionModel.LOG_QUESTION);
		question.setDATE_QUESTION(questionModel.DATE_QUESTION);

		return question;
	}
	
	public QuestionModel convertQuestion2Question2Model(Question question) {
		QuestionModel questionModel = new QuestionModel();


		
		questionModel.setID_QUESTION(question.ID_QUESTION);
		questionModel.setID_AUTHOR(question.ID_AUTHOR);
		questionModel.setTITTLE(question.TITTLE);
		questionModel.setCONTENT_QUESTION(question.CONTENT_QUESTION);
		questionModel.setIMG1_QUESTION(question.IMG1_QUESTION);
		questionModel.setIMG2_QUESTION(question.IMG2_QUESTION);
		questionModel.setIMG3_QUESTION(question.IMG3_QUESTION);
		questionModel.setLOG_QUESTION(question.LOG_QUESTION);
		questionModel.setDATE_QUESTION(question.DATE_QUESTION);
		
		return questionModel;
	}

}
