package com.zifer.zeroproject.component;


import org.springframework.stereotype.Component;

import com.zifer.zeroproject.entity.Answer;
import com.zifer.zeroproject.model.AnswerModel;

@Component("answerConverter")
public class AnswerConverter {
	
	public Answer convert2AnswerModel2Answer(AnswerModel answerModel) {
		Answer answer = new Answer();
		
	
		answer.setID_ANSWER(answerModel.ID_ANSWER);
		answer.setCONTENT_ANSWER(answerModel.CONTENT_ANSWER);
		answer.setIMG1_ANSWER(answerModel.IMG1_ANSWER);
		answer.setIMG2_ANSWER(answerModel.IMG2_ANSWER);
		answer.setIMG3_ANSWER(answerModel.IMG3_ANSWER);
		answer.setLOG_ANSWER(answerModel.LOG_ANSWER);
		answer.setDATE_ANSWER(answerModel.DATE_ANSWER);
		answer.setID_AUTHOR(answerModel.ID_AUTHOR);
		answer.setID_LANGUAGE(answerModel.ID_LANGUAGE);
		answer.setCORRECT_ANSWER(answerModel.CORRECT_ANSWER);
		answer.setID_QUESTION(answerModel.ID_QUESTION);

		return answer;
	}
	
	public AnswerModel convertAnswer2Answer2Model(Answer answer) {
		AnswerModel answerModel = new AnswerModel();
		
		answerModel.setID_ANSWER(answer.ID_ANSWER);
		answerModel.setCONTENT_ANSWER(answer.CONTENT_ANSWER);
		answerModel.setIMG1_ANSWER(answer.IMG1_ANSWER);
		answerModel.setIMG2_ANSWER(answer.IMG2_ANSWER);
		answerModel.setIMG3_ANSWER(answer.IMG3_ANSWER);
		answerModel.setLOG_ANSWER(answer.LOG_ANSWER);
		answerModel.setDATE_ANSWER(answer.DATE_ANSWER);
		answerModel.setID_AUTHOR(answer.ID_AUTHOR);
		answerModel.setID_LANGUAGE(answer.ID_LANGUAGE);
		answerModel.setCORRECT_ANSWER(answer.CORRECT_ANSWER);
		answerModel.setID_QUESTION(answer.ID_QUESTION);
		
		return answerModel;
	}

}
