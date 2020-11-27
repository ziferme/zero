package com.zifer.zeroproject.component;



import java.sql.Date;

import org.springframework.stereotype.Component;

import com.zifer.zeroproject.entity.Author;
import com.zifer.zeroproject.model.AuthorModel;



@Component("authorConverter")
public class AuthorConverter {
	
	public Author convert2AuthorModel2Author(AuthorModel authorModel) {
		Author author = new Author();
			
		author.setID_AUTHOR(authorModel.ID_AUTHOR);
		author.setNICKNAME(authorModel.NICKNAME);
		author.setNAME(authorModel.NAME);
		author.setLAST_NAME(authorModel.LAST_NAME);
		author.setAGE(authorModel.AGE);
		author.setEMAIL(authorModel.EMAIL);
		author.setPASSWORD(authorModel.PASSWORD);
		
		return author;
	}
	
	public AuthorModel convertAuthor2Author2Model(Author author) {
		AuthorModel authorModel = new AuthorModel();
		
		authorModel.setID_AUTHOR(author.ID_AUTHOR);
		authorModel.setNICKNAME(author.NICKNAME);
		authorModel.setNAME(author.NAME);
		authorModel.setLAST_NAME(author.LAST_NAME);
		authorModel.setAGE(author.AGE);
		authorModel.setEMAIL(author.EMAIL);
		authorModel.setPASSWORD(author.PASSWORD);
		
		return authorModel;
	}
	
}

