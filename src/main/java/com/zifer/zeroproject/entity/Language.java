package com.zifer.zeroproject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zero_language")
public class Language {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_LANGUAGE")
	public int ID_LANGUAGE; 
	@Column(name = "LANGUAGE")
	public String LANGUAGE;
	@Column(name = "DESCRIPTION")
	public String DESCRIPTION;
	
	
	
	public int getID_LANGUAGE() {
		return ID_LANGUAGE;
	}



	public void setID_LANGUAGE(int iD_LANGUAGE) {
		ID_LANGUAGE = iD_LANGUAGE;
	}



	public String getLANGUAGE() {
		return LANGUAGE;
	}



	public void setLANGUAGE(String lANGUAGE) {
		LANGUAGE = lANGUAGE;
	}



	public String getDESCRIPTION() {
		return DESCRIPTION;
	}



	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}



	public Language(int iD_LANGUAGE, String lANGUAGE, String dESCRIPTION) {
		super();
		ID_LANGUAGE = iD_LANGUAGE;
		LANGUAGE = lANGUAGE;
		DESCRIPTION = dESCRIPTION;
	}
	
	public Language() {

	}
	


}
