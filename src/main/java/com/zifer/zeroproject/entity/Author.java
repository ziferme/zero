package com.zifer.zeroproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ZERO_AUTHOR")
public class Author {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_AUTHOR")
	public int ID_AUTHOR; 
	@Column(name = "NICKNAME")
	public String NICKNAME;
	@Column(name = "NAME")
	public String NAME;
	@Column(name = "LAST_NAME")
	public String LAST_NAME;
	@Column(name = "AGE")
	public Date AGE;  
	@Column(name = "EMAIL")
	public String EMAIL;
	@Column(name = "PASSWORD")
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
	public Author(int iD_AUTHOR, String nICKNAME, String nAME, String lAST_NAME, Date aGE, String eMAIL,
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
	
	public Author() {
		
	}
	
	

}
