package com.bms.bmsspringbootrestjpamavenproject.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bmsspringbootrestjpamavenproject.model.AuthorPojo;
import com.bms.bmsspringbootrestjpamavenproject.model.BookPojo;
import com.bms.bmsspringbootrestjpamavenproject.service.AuthorService;
import com.bms.bmsspringbootrestjpamavenproject.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("v1")
public class AuthorController {
	
		Logger logger = LoggerFactory.getLogger(BookController.class);
		
		@Autowired
		AuthorService authorService;
		
		@GetMapping("/api/authors")
		public ResponseEntity<List<AuthorPojo>> fetchAllAuthor(){
			logger.info("Entered fetchAllAuthor()...");
			List<AuthorPojo> allAuthors = authorService.fetchAllAuthor();
			logger.info("Exited fetchAllAuthor()...");
			return new ResponseEntity<List<AuthorPojo>>(allAuthors, HttpStatus.OK);
		}
		
		@GetMapping("/api/authors/{aid}")
		public ResponseEntity<Optional<AuthorPojo>> fetchAAuthor(@PathVariable("aid") int authorId) { // PathVaribale literally tells spring to copy the bid into bookId
			logger.info("Entered fetchAAuthor()...");
			Optional<AuthorPojo> optionalAuthor = authorService.fetchAAuthor(authorId);
			logger.info("Exited fetchAAuthor()...");
			return new ResponseEntity<Optional<AuthorPojo>>(optionalAuthor, HttpStatus.OK);
		}

		@PostMapping("/api/authors")
		public ResponseEntity<AuthorPojo> addAuthor(@Valid @RequestBody AuthorPojo newAuthor) {
			AuthorPojo returnedPojo = authorService.addAuthor(newAuthor);
			return new ResponseEntity(returnedPojo, HttpStatus.OK);
		}
	
		@PutMapping("/api/authors")
		public ResponseEntity<AuthorPojo> updateAuthor(@Valid @RequestBody AuthorPojo updateAuthorPojo) {
			AuthorPojo returnedPojo = authorService.updateAuthor(updateAuthorPojo);
			return new ResponseEntity(returnedPojo, HttpStatus.OK);
		}
	   
		@DeleteMapping("/api/authors/{authorId}")
		public ResponseEntity<Void> removeAuthor(@PathVariable("authorId") int aid) {
			authorService.removeAuthor(aid);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
}
