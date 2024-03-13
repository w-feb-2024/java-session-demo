package com.bms.bmsspringbootrestjpamavenproject.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bmsspringbootrestjpamavenproject.model.BookPojo;

@Service
public class BookServiceImpl implements BookService{
	
	Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	@Override
	public List<BookPojo> fetchAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<BookPojo> fetchABook(int bookId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<BookPojo> fetchByBookGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
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
