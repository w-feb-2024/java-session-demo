package com.bms.bmsspringbootrestjpamavenproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bmsspringbootrestjpamavenproject.dao.BookDao;
import com.bms.bmsspringbootrestjpamavenproject.dao.entity.AuthorEntity;
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
			BookPojo bookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, bookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthor(), authorPojo);
			bookPojo.setAuthor(authorPojo);
			allBooksPojo.add(bookPojo);
		}
		return allBooksPojo;
	}

	@Override
	public Optional<BookPojo> fetchABook(int bookId) {
		Optional<BookEntity> optionalBookEntity = bookDao.findById(bookId);
		if(optionalBookEntity.isPresent()) {
			BookEntity eachBookEntity = optionalBookEntity.get();
			BookPojo bookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, bookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthor(), authorPojo);
			bookPojo.setAuthor(authorPojo);
			return Optional.of(bookPojo);
		}
		return Optional.empty();
	}

	@Override
	public List<BookPojo> fetchByBookGenre(String genre) {
		//List<BookEntity> allBooksEntity = bookDao.findByBookGenre(genre);
		List<BookEntity> allBooksEntity = bookDao.getAllBooksByGenre(genre);
		List<BookPojo> allBooksPojo = new ArrayList<>();
		for(BookEntity eachBookEntity: allBooksEntity) {
			BookPojo bookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, bookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthor(), authorPojo);
			bookPojo.setAuthor(authorPojo);
			allBooksPojo.add(bookPojo);
		}
		return allBooksPojo;
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.deleteById(bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		BookEntity newBookEntity = new BookEntity();
		BeanUtils.copyProperties(newBook, newBookEntity); // this will not copy the nested pojo
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newBook.getAuthor(),authorEntity);;
		newBookEntity.setAuthor(authorEntity);
		
		bookDao.saveAndFlush(newBookEntity); // here save will work as insert because the bookId inside newBookEntity does not exist in the DB
		//bookDao.flush(); // sync the entity object and the record in the DB to which it is associated
		newBook.setBookId(newBookEntity.getBookId());
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		BookEntity updateBookEntity = new BookEntity();
		BeanUtils.copyProperties(updateBook, updateBookEntity); // this will not copy the nested pojo
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(updateBook.getAuthor(),authorEntity);
		updateBookEntity.setAuthor(authorEntity);
		
		bookDao.save(updateBookEntity); // here save will work as update because the bookId inside updateBookEntity exists in the DB
		return updateBook;
	}
	
	
}
