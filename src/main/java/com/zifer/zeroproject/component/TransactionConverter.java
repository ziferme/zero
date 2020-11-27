package com.zifer.zeroproject.component;

import org.springframework.stereotype.Component;

import com.zifer.zeroproject.entity.Transaction;
import com.zifer.zeroproject.model.TransactionModel;



@Component("transactionConverter")
public class TransactionConverter {
	
	public Transaction convert2TransactionModel2Transaction(TransactionModel transactionModel) {
		Transaction transaction = new Transaction();
		
		transaction.setID_TRANSACTION(transactionModel.ID_TRANSACTION);
		transaction.setID_QUESTION(transactionModel.ID_QUESTION);
		transaction.setMONTO(transactionModel.MONTO);
		transaction.setCOMISION(transactionModel.COMISION);
		transaction.setOFRECIDO_FINAL(transactionModel.OFRECIDO_FINAL);
		transaction.setID_STATUS_TRANSACTION(transactionModel.ID_STATUS_TRANSACTION);

		return transaction;
	}
	
	public TransactionModel convertTransaction2Transaction2Model(Transaction transaction) {
		TransactionModel transactionModel = new TransactionModel();

		transactionModel.setID_TRANSACTION(transaction.ID_TRANSACTION);
		transactionModel.setID_QUESTION(transaction.ID_QUESTION);
		transactionModel.setMONTO(transaction.MONTO);
		transactionModel.setCOMISION(transaction.COMISION);
		transactionModel.setOFRECIDO_FINAL(transaction.OFRECIDO_FINAL);
		transactionModel.setID_STATUS_TRANSACTION(transaction.ID_STATUS_TRANSACTION);

		return transactionModel;
	}

}
