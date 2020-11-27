package com.zifer.zeroproject.model;

import javax.persistence.Column;

public class TransactionModel {
	
	public int ID_TRANSACTION; 	
	public int ID_QUESTION;  		
	public double MONTO;  			
	public double COMISION;  		
	public double OFRECIDO_FINAL;  	
	public int ID_STATUS_TRANSACTION;
	
	public int getID_TRANSACTION() {
		return ID_TRANSACTION;
	}
	public void setID_TRANSACTION(int iD_TRANSACTION) {
		ID_TRANSACTION = iD_TRANSACTION;
	}
	public int getID_QUESTION() {
		return ID_QUESTION;
	}
	public void setID_QUESTION(int iD_QUESTION) {
		ID_QUESTION = iD_QUESTION;
	}
	public double getMONTO() {
		return MONTO;
	}
	public void setMONTO(double mONTO) {
		MONTO = mONTO;
	}
	public double getCOMISION() {
		return COMISION;
	}
	public void setCOMISION(double cOMISION) {
		COMISION = cOMISION;
	}
	public double getOFRECIDO_FINAL() {
		return OFRECIDO_FINAL;
	}
	public void setOFRECIDO_FINAL(double oFRECIDO_FINAL) {
		OFRECIDO_FINAL = oFRECIDO_FINAL;
	}
	public int getID_STATUS_TRANSACTION() {
		return ID_STATUS_TRANSACTION;
	}
	public void setID_STATUS_TRANSACTION(int ID_STATUS_TRANSACTION) {
		ID_STATUS_TRANSACTION = ID_STATUS_TRANSACTION;
	}
	
	public TransactionModel(int iD_TRANSACTION, int iD_QUESTION, double mONTO, double cOMISION, double oFRECIDO_FINAL,
			int ID_STATUS_TRANSACTION) {
		super();
		ID_TRANSACTION = iD_TRANSACTION;
		ID_QUESTION = iD_QUESTION;
		MONTO = mONTO;
		COMISION = cOMISION;
		OFRECIDO_FINAL = oFRECIDO_FINAL;
		ID_STATUS_TRANSACTION = ID_STATUS_TRANSACTION;
	}
	
	public TransactionModel() {

	}
	
	

}
