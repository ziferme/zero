package com.zifer.zeroproject.service;

import java.util.List;

import com.zifer.zeroproject.model.TransactionModel;

public interface TransactionService {
	
	public abstract TransactionModel addaTransaction(TransactionModel TransactionModel);
	
	public TransactionModel getTransaction(int ID_TRANSACTION);

	public abstract List<TransactionModel> listAllTransaction();

}
