package com.bms.bmsspringbootrestjpamavenproject.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bmsspringbootrestjpamavenproject.model.BookPojo;
import com.bms.bmsspringbootrestjpamavenproject.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("v1")
public class BookController {

	// create the endpoints
	//BookService bookService = new BookServiceImpl();
	Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	// fetch all books
	// http://localhost:9595/v1/api/books
	@GetMapping("/api/books")
	//public List<BookPojo> fetchAllBook(){
	public ResponseEntity<List<BookPojo>> fetchAllBook(){
		logger.info("Entered fetchAllBook()...");
		List<BookPojo> allBooks = bookService.fetchAllBook();
		logger.info("Exited fetchAllBook()...");
		//return allBooks;
		return new ResponseEntity<List<BookPojo>>(allBooks, HttpStatus.OK);
	}
	
	// fetch a book
	// http://localhost:9595/v1/api/books/2
	@GetMapping("/api/books/{bid}")
//	public Optional<BookPojo> fetchABook(@PathVariable("bid") int bookId) { // PathVaribale literally tells spring to copy the bid into bookId
	public ResponseEntity<Optional<BookPojo>> fetchABook(@PathVariable("bid") int bookId) { // PathVaribale literally tells spring to copy the bid into bookId
		logger.info("Entered fetchABook()...");
		Optional<BookPojo> optionalBook = bookService.fetchABook(bookId);
		logger.info("Exited fetchABook()...");
		//return optionalBook;
		return new ResponseEntity<Optional<BookPojo>>(optionalBook, HttpStatus.OK);
	}
	
	// fetch books by genre
	// http://localhost:9595/v1/api/books/genre/Fantasy
	@GetMapping("/api/books/genre/{genre}")
//	public List<BookPojo> fetchByBookGenre(@PathVariable("genre") String bookGenre){
	public ResponseEntity<List<BookPojo>> fetchByBookGenre(@PathVariable("genre") String bookGenre){
		List<BookPojo> allGenreBooks = bookService.fetchByBookGenre(bookGenre);
		//return allGenreBooks;
		return new ResponseEntity(allGenreBooks, HttpStatus.OK);
				
	}
	
	// add a book
	// http://localhost:9595/v1/api/books
	@PostMapping("/api/books")
//	public BookPojo addBook(@RequestBody BookPojo newBook) { // using @RequestBody annotation will copy the incoming request body into the newBook object
	public ResponseEntity<BookPojo> addBook(@Valid @RequestBody BookPojo newBook) { // using @RequestBody annotation will copy the incoming request body into the newBook object
		BookPojo returnedPojo = bookService.addBook(newBook);
		//return returnedPojo;
		return new ResponseEntity(returnedPojo, HttpStatus.OK);
	}
	
	// update a book
	// http://localhost:9595/v1/api/books
	@PutMapping("/api/books")
//	public BookPojo updateBook(@RequestBody BookPojo updateBookPojo) { // using @RequestBody annotation will copy the incoming request body into the newBook object
	public ResponseEntity<BookPojo> updateBook(@Valid @RequestBody BookPojo updateBookPojo) { // using @RequestBody annotation will copy the incoming request body into the newBook object
		BookPojo returnedPojo = bookService.updateBook(updateBookPojo);
		//return returnedPojo;
		return new ResponseEntity(returnedPojo, HttpStatus.OK);
	}
   
	// delete a book
	// http://localhost:9595/v1/api/books/6
	@DeleteMapping("/api/books/{bookId}")
//	public void removeBook(@PathVariable("bookId") int bid) {
	public ResponseEntity<Void> removeBook(@PathVariable("bookId") int bid) {
		bookService.removeBook(bid);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
