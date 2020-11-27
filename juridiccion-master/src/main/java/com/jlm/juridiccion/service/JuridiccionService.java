package com.jlm.juridiccion.service;


import java.util.List;

import com.jlm.juridiccion.model.JuridiccionModel;

public interface JuridiccionService {
	
public abstract JuridiccionModel addJuridiccion(JuridiccionModel JuridiccionModel);
	
public JuridiccionModel getJuridiccion(int ID_JURISDICCION_ALTO_RIESGO);

public abstract List<JuridiccionModel> listAllJuridiccion();

public void removeJuridiccion(int ID_JURISDICCION_ALTO_RIESGO);

public void updateJuridiccionBy(String JURISDICCION_ALTO_RIESGO, String ESTATUS, int ID_JURISDICCION_ALTO_RIESGO );

}
