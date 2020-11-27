package com.zifer.zeroproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zifer.zeroproject.component.AnswerConverter;
import com.zifer.zeroproject.entity.Answer;
import com.zifer.zeroproject.model.AnswerModel;
import com.zifer.zeroproject.repository.AnswerRepository;

import com.zifer.zeroproject.service.AnswerService;


@Service("answerServiceImpl")
public class AnswerServiceImpl  implements AnswerService {
	
	@Qualifier("answerConverter")
	private AnswerConverter answerConverter;
	
	@Autowired
	@Qualifier("answerRepository")
	private AnswerRepository answerRepository;

	@Override
	public AnswerModel addAnswer(AnswerModel AnswerModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnswerModel getAnswer(int ID_ANSWER) {
		
        Answer answerEntity = answerRepository.findAnswerBy(ID_ANSWER);
        
        
		
		AnswerModel answerModel = new AnswerModel();
		try {
		answerModel = answerConverter.convertAnswer2Answer2Model(answerEntity);
		
				if (answerModel.ID_ANSWER == 1) {
					System.out.print("No esta vacio");
				}
		}catch (NullPointerException excepcion) {
			System.out.print("Fallo");
		}
		
		return answerModel;
	}

	@Override
	public List<AnswerModel> listAllAnswer() {
		// TODO Auto-generated method stub
		return null;
	}


}
