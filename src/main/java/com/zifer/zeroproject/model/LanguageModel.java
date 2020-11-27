package com.zifer.zeroproject.model;


public class LanguageModel {
	
	public int ID_LANGUAGE; 
	public String LANGUAGE;
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
	public LanguageModel(int iD_LANGUAGE, String lANGUAGE, String dESCRIPTION) {
		super();
		ID_LANGUAGE = iD_LANGUAGE;
		LANGUAGE = lANGUAGE;
		DESCRIPTION = dESCRIPTION;
	}

	public LanguageModel() {

	}
	

}
