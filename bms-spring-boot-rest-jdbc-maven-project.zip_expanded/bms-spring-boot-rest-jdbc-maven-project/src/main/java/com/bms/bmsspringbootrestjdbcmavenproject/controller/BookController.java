package com.bms.bmsspringbootrestjdbcmavenproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bmsspringbootrestjdbcmavenproject.model.BookPojo;
import com.bms.bmsspringbootrestjdbcmavenproject.service.BookServiceImpl;
import com.bms.bmsspringbootrestjdbcmavenproject.service.BookService;

@RestController
@RequestMapping("v1")
public class BookController {

	// create the endpoints
	//BookService bookService = new BookServiceImpl();
	
	@Autowired
	BookService bookService;
	
	// fetch all books
	// http://localhost:9595/v1/api/books
	@GetMapping("/api/books")
	public List<BookPojo> fetchAllBook(){
		List<BookPojo> allBooks = bookService.fetchAllBook();
		return allBooks;
	}
	
	// fetch a book
	// http://localhost:9595/v1/api/books/2
	@GetMapping("/api/books/{bid}")
	public Optional<BookPojo> fetchABook(@PathVariable("bid") int bookId) { // PathVaribale literally tells spring to copy the bid into bookId
		Optional<BookPojo> optionalBook = bookService.fetchABook(bookId);
		return optionalBook;
	}
	
	// fetch books by genre
	// http://localhost:9595/v1/api/books/genre/Fantasy
	@GetMapping("/api/books/genre/{genre}")
	public List<BookPojo> fetchByBookGenre(@PathVariable("genre") String bookGenre){
		List<BookPojo> allGenreBooks = bookService.fetchByBookGenre(bookGenre);
		return allGenreBooks;
	}
	
	// add a book
	
	// update a book
	
	// delete a book
	// http://localhost:9595/v1/api/books/6
	@DeleteMapping("/api/books/{bookId}")
	public void removeBook(@PathVariable("bookId") int bid) {
		bookService.removeBook(bid);
	}
}
