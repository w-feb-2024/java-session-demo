package com.bms.bmsspringbootrestjpamavenproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bmsspringbootrestjpamavenproject.dao.BookDao;
import com.bms.bmsspringbootrestjpamavenproject.dao.entity.BookEntity;
import com.bms.bmsspringbootrestjpamavenproject.model.AuthorPojo;
import com.bms.bmsspringbootrestjpamavenproject.model.BookPojo;

@Service
public class BookServiceImpl implements BookService{
	
	Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookPojo> fetchAllBook() {
		List<BookEntity> allBooksEntity = bookDao.findAll();
		List<BookPojo> allBooksPojo = new ArrayList<>();
		for(BookEntity eachBookEntity: allBooksEntity) {
			BookPojo bookPojo = new BookPojo(eachBookEntity.getBookId(), eachBookEntity.getBookTitle(), new AuthorPojo(eachBookEntity.getBookAuthorId(), null, null), eachBookEntity.getBookGenre(), eachBookEntity.getBookPublished(), eachBookEntity.getBookPrice(), eachBookEntity.getBookImageUrl());
			allBooksPojo.add(bookPojo);
		}
		return allBooksPojo;
	}

	@Override
	public Optional<BookPojo> fetchABook(int bookId) {
		Optional<BookEntity> optionalBookEntity = bookDao.findById(bookId);
		if(optionalBookEntity.isPresent()) {
			BookEntity eachBookEntity = optionalBookEntity.get();
			return Optional.of(new BookPojo(eachBookEntity.getBookId(), eachBookEntity.getBookTitle(), new AuthorPojo(eachBookEntity.getBookAuthorId(), null, null), eachBookEntity.getBookGenre(), eachBookEntity.getBookPublished(), eachBookEntity.getBookPrice(), eachBookEntity.getBookImageUrl()));
		}
		return Optional.empty();
	}

	@Override
	public List<BookPojo> fetchByBookGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.deleteById(bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
