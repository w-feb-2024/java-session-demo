package dao;

import java.util.List;

import model.BookPojo;

public interface BookDao {
	List<BookPojo> fetchAllBook();
	BookPojo fetchABook(int bookId);
	List<BookPojo> fetchByBookGenre(String genre);
	void removeBook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
}
