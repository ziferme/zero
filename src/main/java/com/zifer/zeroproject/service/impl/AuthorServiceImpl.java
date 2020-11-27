package com.zifer.zeroproject.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zifer.zeroproject.component.AuthorConverter;
import com.zifer.zeroproject.entity.Author;
import com.zifer.zeroproject.model.AuthorModel;
import com.zifer.zeroproject.repository.AuthorRepository;
import com.zifer.zeroproject.service.AuthorService;


@Service("authorServiceImpl")
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	@Qualifier("authorConverter")
	private AuthorConverter authorConverter;
	
	@Autowired
	@Qualifier("authorRepository")
	private AuthorRepository authorRepository;

	@Override
	public AuthorModel addAuthor(AuthorModel AuthorModel) {
		
		return null;
	}

	@Override
	public AuthorModel getAuthor(int ID_AUTHOR) {
		Author authorEntity = authorRepository.findAuthorBy(ID_AUTHOR);
		
		AuthorModel authorModel = new AuthorModel();
		authorModel = authorConverter.convertAuthor2Author2Model(authorEntity);
	    
		
		return authorModel;
	}

	@Override
	public List<AuthorModel> listAllAuthor() {
		// TODO Auto-generated method stub
				List<Author> author = authorRepository.findAll();
				List<AuthorModel> authorModel = new ArrayList<AuthorModel>();
				for (Author author1 : author) {
					authorModel.add(authorConverter.convertAuthor2Author2Model(author1));
				}
				return authorModel;
	}
/*
	@Override
	public void removeAuthor(int ID_JURISDICCION_ALTO_RIESGO) {
		authorRepository.removeAuthor(ID_JURISDICCION_ALTO_RIESGO);
		
	}

	@Override
	public void updateAuthorBy(String JURISDICCION_ALTO_RIESGO, String ESTATUS, int ID_JURISDICCION_ALTO_RIESGO) {
		authorRepository.updateAuthorBy(JURISDICCION_ALTO_RIESGO, ESTATUS, ID_JURISDICCION_ALTO_RIESGO);
	}*/
}
