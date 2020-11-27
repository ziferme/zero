package com.zifer.zeroproject.component;

import org.springframework.stereotype.Component;

import com.zifer.zeroproject.entity.Juridiccion;
import com.zifer.zeroproject.model.JuridiccionModel;


@Component("juridiccionConverter")
public class JuridiccionConverter {
	
	
	public Juridiccion convert2JuridiccionModel2Juridiccion(JuridiccionModel juridiccionModel) {
		Juridiccion juridiccion = new Juridiccion();
		juridiccion.setID_JURISDICCION_ALTO_RIESGO(juridiccionModel.ID_JURISDICCION_ALTO_RIESGO);
		juridiccion.setJURISDICCION_ALTO_RIESGO(juridiccionModel.JURISDICCION_ALTO_RIESGO);
		juridiccion.setESTATUS(juridiccionModel.ESTATUS);
		juridiccion.setREGISTRO_CONTROL(juridiccion.REGISTRO_CONTROL);
		return juridiccion;
	}
	
	public JuridiccionModel convertJuridiccion2Juridiccion2Model(Juridiccion juridiccion) {
		JuridiccionModel juridiccionModel = new JuridiccionModel();
		juridiccionModel.setID_JURISDICCION_ALTO_RIESGO(juridiccion.ID_JURISDICCION_ALTO_RIESGO);
		juridiccionModel.setJURISDICCION_ALTO_RIESGO(juridiccion.JURISDICCION_ALTO_RIESGO);
		juridiccionModel.setESTATUS(juridiccion.ESTATUS);
		juridiccionModel.setREGISTRO_CONTROL(juridiccion.REGISTRO_CONTROL);

		return juridiccionModel;
	}

}
