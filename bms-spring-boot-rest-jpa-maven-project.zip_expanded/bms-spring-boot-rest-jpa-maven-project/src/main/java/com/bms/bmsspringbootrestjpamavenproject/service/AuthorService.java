package com.bms.bmsspringbootrestjpamavenproject.service;

import java.util.List;
import java.util.Optional;

import com.bms.bmsspringbootrestjpamavenproject.model.AuthorPojo;
import com.bms.bmsspringbootrestjpamavenproject.model.BookPojo;

public interface AuthorService {
	List<AuthorPojo> fetchAllAuthor();
	Optional<AuthorPojo> fetchAAuthor(int authorId);
	void removeAuthor(int authorId);
	AuthorPojo addAuthor(AuthorPojo newAuthor);
	AuthorPojo updateAuthor(AuthorPojo updateAuthor);
}
