package com.bms.bmsspringbootrestjpamavenproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bmsspringbootrestjpamavenproject.dao.AuthorDao;
import com.bms.bmsspringbootrestjpamavenproject.dao.entity.AuthorEntity;
import com.bms.bmsspringbootrestjpamavenproject.dao.entity.BookEntity;
import com.bms.bmsspringbootrestjpamavenproject.model.AuthorPojo;
import com.bms.bmsspringbootrestjpamavenproject.model.BookPojo;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorDao authorDao;
	
	@Override
	public List<AuthorPojo> fetchAllAuthor() {
		List<AuthorEntity> allAuthorsEntity = authorDao.findAll();
		List<AuthorPojo> allAuthorsPojo = new ArrayList<>();
		for(AuthorEntity eachAuthorEntity: allAuthorsEntity) {
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachAuthorEntity, authorPojo);
			List<BookPojo> allBooksPojo = new ArrayList<>();
			for(BookEntity eachBookEntity: eachAuthorEntity.getAllBooks()) {
				BookPojo bookPojo = new BookPojo();
				BeanUtils.copyProperties(eachBookEntity, bookPojo);
				allBooksPojo.add(bookPojo);		
			}
			authorPojo.setAllBooks(allBooksPojo);
			allAuthorsPojo.add(authorPojo);
		}
		return allAuthorsPojo;
	}

	@Override
	public Optional<AuthorPojo> fetchAAuthor(int authorId) {
		Optional<AuthorEntity> optionAuthorEntity = authorDao.findById(authorId);
		if(optionAuthorEntity.isPresent()) {
			AuthorEntity authorEntity = optionAuthorEntity.get();
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(authorEntity, authorPojo);
			List<BookPojo> allBooksPojo = new ArrayList<>();
			for(BookEntity eachBookEntity: authorEntity.getAllBooks()) {
				BookPojo bookPojo = new BookPojo();
				BeanUtils.copyProperties(eachBookEntity, bookPojo);
				allBooksPojo.add(bookPojo);		
			}
			authorPojo.setAllBooks(allBooksPojo);
			return Optional.of(authorPojo);
		}
		return Optional.empty();
	}

	@Override
	public void removeAuthor(int authorId) {
		
	}

	@Override
	public AuthorPojo addAuthor(AuthorPojo newAuthor) {
		return null;
	}

	@Override
	public AuthorPojo updateAuthor(AuthorPojo updateAuthor) {
		return null;
	}

}
