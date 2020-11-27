package com.zifer.zeroproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zero_answer")
public class Answer {
	
	
	@Id
	@GeneratedValue
	@Column(name = "ID_ANSWER")
	public int ID_ANSWER;
	@Column(name = "CONTENT_ANSWER")
	public String CONTENT_ANSWER;
	@Column(name = "IMG1_ANSWER")
	public byte[] IMG1_ANSWER;
	@Column(name = "IMG2_ANSWER")
	public byte[] IMG2_ANSWER;
	@Column(name = "IMG3_ANSWER")
	public byte[] IMG3_ANSWER;
	@Column(name = "LOG_ANSWER")
	public byte[] LOG_ANSWER;
	@Column(name = "DATE_ANSWER")
	public Date DATE_ANSWER;
	@Column(name = "ID_AUTHOR")
	public int ID_AUTHOR;
	@Column(name = "ID_LANGUAGE")
	public int ID_LANGUAGE;  
	@Column(name = "CORRECT_ANSWER")
	public int CORRECT_ANSWER;
	@Column(name = "ID_QUESTION")
	public int ID_QUESTION;
	public int getID_ANSWER() {
		return ID_ANSWER;
	}
	public void setID_ANSWER(int iD_ANSWER) {
		ID_ANSWER = iD_ANSWER;
	}
	public String getCONTENT_ANSWER() {
		return CONTENT_ANSWER;
	}
	public void setCONTENT_ANSWER(String cONTENT_ANSWER) {
		CONTENT_ANSWER = cONTENT_ANSWER;
	}
	public byte[] getIMG1_ANSWER() {
		return IMG1_ANSWER;
	}
	public void setIMG1_ANSWER(byte[] iMG1_ANSWER) {
		IMG1_ANSWER = iMG1_ANSWER;
	}
	public byte[] getIMG2_ANSWER() {
		return IMG2_ANSWER;
	}
	public void setIMG2_ANSWER(byte[] iMG2_ANSWER) {
		IMG2_ANSWER = iMG2_ANSWER;
	}
	public byte[] getIMG3_ANSWER() {
		return IMG3_ANSWER;
	}
	public void setIMG3_ANSWER(byte[] iMG3_ANSWER) {
		IMG3_ANSWER = iMG3_ANSWER;
	}
	public byte[] getLOG_ANSWER() {
		return LOG_ANSWER;
	}
	public void setLOG_ANSWER(byte[] lOG_ANSWER) {
		LOG_ANSWER = lOG_ANSWER;
	}
	public Date getDATE_ANSWER() {
		return DATE_ANSWER;
	}
	public void setDATE_ANSWER(Date dATE_ANSWER) {
		DATE_ANSWER = dATE_ANSWER;
	}
	public int getID_AUTHOR() {
		return ID_AUTHOR;
	}
	public void setID_AUTHOR(int iD_AUTHOR) {
		ID_AUTHOR = iD_AUTHOR;
	}
	public int getID_LANGUAGE() {
		return ID_LANGUAGE;
	}
	public void setID_LANGUAGE(int iD_LANGUAGE) {
		ID_LANGUAGE = iD_LANGUAGE;
	}
	public int getCORRECT_ANSWER() {
		return CORRECT_ANSWER;
	}
	public void setCORRECT_ANSWER(int cORRECT_ANSWER) {
		CORRECT_ANSWER = cORRECT_ANSWER;
	}
	public int getID_QUESTION() {
		return ID_QUESTION;
	}
	public void setID_QUESTION(int iD_QUESTION) {
		ID_QUESTION = iD_QUESTION;
	}
	public Answer(int iD_ANSWER, String cONTENT_ANSWER, byte[] iMG1_ANSWER, byte[] iMG2_ANSWER, byte[] iMG3_ANSWER,
			byte[] lOG_ANSWER, Date dATE_ANSWER, int iD_AUTHOR, int iD_LANGUAGE, int cORRECT_ANSWER, int iD_QUESTION) {
		super();
		ID_ANSWER = iD_ANSWER;
		CONTENT_ANSWER = cONTENT_ANSWER;
		IMG1_ANSWER = iMG1_ANSWER;
		IMG2_ANSWER = iMG2_ANSWER;
		IMG3_ANSWER = iMG3_ANSWER;
		LOG_ANSWER = lOG_ANSWER;
		DATE_ANSWER = dATE_ANSWER;
		ID_AUTHOR = iD_AUTHOR;
		ID_LANGUAGE = iD_LANGUAGE;
		CORRECT_ANSWER = cORRECT_ANSWER;
		ID_QUESTION = iD_QUESTION;
	}
	
	public Answer(){

	}
	
	
	

}
