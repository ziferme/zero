package com.zifer.zeroproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "zero_question")
public class Question {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_QUESTION")
	public int ID_QUESTION;
	@Column(name = "ID_AUTHOR")
	public int ID_AUTHOR;
	@Column(name = "TITTLE")
	public String TITTLE;
	@Column(name = "CONTENT_QUESTION")
	public String CONTENT_QUESTION;
	@Column(name = "IMG1_QUESTION")
	public byte[] IMG1_QUESTION;
	@Column(name = "IMG2_QUESTION")
	public byte[] IMG2_QUESTION;
	@Column(name = "IMG3_QUESTION")
	public byte[] IMG3_QUESTION;
	@Column(name = "LOG_QUESTION")
	public byte[] LOG_QUESTION;
	@Column(name = "DATE_QUESTION")
	public Date DATE_QUESTION;
	public int getID_QUESTION() {
		return ID_QUESTION;
	}
	public void setID_QUESTION(int iD_QUESTION) {
		ID_QUESTION = iD_QUESTION;
	}
	public int getID_AUTHOR() {
		return ID_AUTHOR;
	}
	public void setID_AUTHOR(int iD_AUTHOR) {
		ID_AUTHOR = iD_AUTHOR;
	}
	public String getTITTLE() {
		return TITTLE;
	}
	public void setTITTLE(String tITTLE) {
		TITTLE = tITTLE;
	}
	public String getCONTENT_QUESTION() {
		return CONTENT_QUESTION;
	}
	public void setCONTENT_QUESTION(String cONTENT_QUESTION) {
		CONTENT_QUESTION = cONTENT_QUESTION;
	}
	public byte[] getIMG1_QUESTION() {
		return IMG1_QUESTION;
	}
	public void setIMG1_QUESTION(byte[] iMG1_QUESTION) {
		IMG1_QUESTION = iMG1_QUESTION;
	}
	public byte[] getIMG2_QUESTION() {
		return IMG2_QUESTION;
	}
	public void setIMG2_QUESTION(byte[] iMG2_QUESTION) {
		IMG2_QUESTION = iMG2_QUESTION;
	}
	public byte[] getIMG3_QUESTION() {
		return IMG3_QUESTION;
	}
	public void setIMG3_QUESTION(byte[] iMG3_QUESTION) {
		IMG3_QUESTION = iMG3_QUESTION;
	}
	public byte[] getLOG_QUESTION() {
		return LOG_QUESTION;
	}
	public void setLOG_QUESTION(byte[] lOG_QUESTION) {
		LOG_QUESTION = lOG_QUESTION;
	}
	public Date getDATE_QUESTION() {
		return DATE_QUESTION;
	}
	public void setDATE_QUESTION(Date dATE_QUESTION) {
		DATE_QUESTION = dATE_QUESTION;
	}
	
	public Question(int iD_QUESTION, int iD_AUTHOR, String tITTLE, String cONTENT_QUESTION, byte[] iMG1_QUESTION,
			byte[] iMG2_QUESTION, byte[] iMG3_QUESTION, byte[] lOG_QUESTION, Date dATE_QUESTION) {
		super();
		ID_QUESTION = iD_QUESTION;
		ID_AUTHOR = iD_AUTHOR;
		TITTLE = tITTLE;
		CONTENT_QUESTION = cONTENT_QUESTION;
		IMG1_QUESTION = iMG1_QUESTION;
		IMG2_QUESTION = iMG2_QUESTION;
		IMG3_QUESTION = iMG3_QUESTION;
		LOG_QUESTION = lOG_QUESTION;
		DATE_QUESTION = dATE_QUESTION;
	}
	
	public Question() {

	}
	
	

}
