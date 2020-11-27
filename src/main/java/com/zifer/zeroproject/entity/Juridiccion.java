package com.zifer.zeroproject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "juridiccion")
public class Juridiccion {

	@Id
	@GeneratedValue
	@Column(name = "ID_JURISDICCION_ALTO_RIESGO")
	public int ID_JURISDICCION_ALTO_RIESGO;
	@Column(name = "JURISDICCION_ALTO_RIESGO")
	public String JURISDICCION_ALTO_RIESGO;
	@Column(name = "ESTATUS")
	public String ESTATUS;
	@Column(name = "REGISTRO_CONTROL")
	public Date REGISTRO_CONTROL;
	
	public int getID_JURISDICCION_ALTO_RIESGO() {
		return ID_JURISDICCION_ALTO_RIESGO;
	}
	public void setID_JURISDICCION_ALTO_RIESGO(int iD_JURISDICCION_ALTO_RIESGO) {
		ID_JURISDICCION_ALTO_RIESGO = iD_JURISDICCION_ALTO_RIESGO;
	}
	public String getJURISDICCION_ALTO_RIESGO() {
		return JURISDICCION_ALTO_RIESGO;
	}
	public void setJURISDICCION_ALTO_RIESGO(String jURISDICCION_ALTO_RIESGO) {
		JURISDICCION_ALTO_RIESGO = jURISDICCION_ALTO_RIESGO;
	}
	public String getESTATUS() {
		return ESTATUS;
	}
	public void setESTATUS(String eSTATUS) {
		ESTATUS = eSTATUS;
	}
	public Date getREGISTRO_CONTROL() {
		return REGISTRO_CONTROL;
	}
	public void setREGISTRO_CONTROL(Date rEGISTRO_CONTROL) {
		REGISTRO_CONTROL = rEGISTRO_CONTROL;
	}
	public Juridiccion(int iD_JURISDICCION_ALTO_RIESGO, String jURISDICCION_ALTO_RIESGO, String eSTATUS,
			Date rEGISTRO_CONTROL) {
		super();
		ID_JURISDICCION_ALTO_RIESGO = iD_JURISDICCION_ALTO_RIESGO;
		JURISDICCION_ALTO_RIESGO = jURISDICCION_ALTO_RIESGO;
		ESTATUS = eSTATUS;
		REGISTRO_CONTROL = rEGISTRO_CONTROL;
	}
	
	public Juridiccion() {

	}
	
	

}
