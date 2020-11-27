package com.zifer.zeroproject.model;

import java.util.Date;

public class AuthorModel {
	
	public int ID_AUTHOR; 
	public String NICKNAME;
	public String NAME;
	public String LAST_NAME;
	public Date AGE;  
	public String EMAIL;
	public String PASSWORD;
	public int getID_AUTHOR() {
		return ID_AUTHOR;
	}
	public void setID_AUTHOR(int iD_AUTHOR) {
		ID_AUTHOR = iD_AUTHOR;
	}
	public String getNICKNAME() {
		return NICKNAME;
	}
	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public Date getAGE() {
		return AGE;
	}
	public void setAGE(Date aGE) {
		AGE = aGE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	public AuthorModel(int iD_AUTHOR, String nICKNAME, String nAME, String lAST_NAME, Date aGE, String eMAIL,
			String pASSWORD) {
		super();
		ID_AUTHOR = iD_AUTHOR;
		NICKNAME = nICKNAME;
		NAME = nAME;
		LAST_NAME = lAST_NAME;
		AGE = aGE;
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
	}
	
	public AuthorModel( ) {
		 
	}
	
	


}
