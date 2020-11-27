package com.zifer.zeroproject.service;

import java.util.List;

import com.zifer.zeroproject.model.AuthorModel;



public interface AuthorService {

	public abstract AuthorModel addAuthor(AuthorModel AuthorModel);
	
	public AuthorModel getAuthor(int ID_AUTHOR);

	public abstract List<AuthorModel> listAllAuthor();
/*
	public void removeAuthor(int ID_JURISDICCION_ALTO_RIESGO);

	public void updateAuthorBy(String JURISDICCION_ALTO_RIESGO, String ESTATUS, int ID_JURISDICCION_ALTO_RIESGO );
*/
}
