package dao;

import java.util.List;
import java.util.Optional;

import model.BookPojo;

public class BookDaoJdbcImpl implements BookDao{

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
