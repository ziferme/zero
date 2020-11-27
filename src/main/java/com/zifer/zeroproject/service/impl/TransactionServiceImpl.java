package com.zifer.zeroproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.zifer.zeroproject.component.TransactionConverter;
import com.zifer.zeroproject.entity.Transaction;
import com.zifer.zeroproject.model.TransactionModel;
import com.zifer.zeroproject.repository.TransactionRepository;
import com.zifer.zeroproject.service.TransactionService;

@Service("transactionServiceImpl")
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	@Qualifier("transactionConverter")
	private TransactionConverter transactionConverter;
	
	@Autowired
	@Qualifier("transactionRepository")
	private TransactionRepository transactionRepository;
	
	public TransactionModel addTransaction(TransactionModel TransactionModel) {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionModel getTransaction(int ID_TRANSACTION) {
		Transaction transactionEntity = transactionRepository.findTransactionBy(ID_TRANSACTION);
		System.out.print("************************$$"+transactionEntity.ID_TRANSACTION+"$$");
		TransactionModel transactionModel = new TransactionModel();
		transactionModel = transactionConverter.convertTransaction2Transaction2Model(transactionEntity);
	    
		
		return transactionModel;
	}

	public List<TransactionModel> listAllTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransactionModel addaTransaction(TransactionModel TransactionModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
