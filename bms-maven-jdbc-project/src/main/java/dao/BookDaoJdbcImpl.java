package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.AuthorPojo;
import model.BookPojo;

public class BookDaoJdbcImpl implements BookDao{

	@Override
	public List<BookPojo> fetchAllBook() {
		Connection conn = DBUtil.makeConnection();
		List<BookPojo> allBooks = new ArrayList<>(); // we will copy the rs in this collection
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBNativeSqlQueries.BOOK_FETCH_ALL);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BookPojo book = new BookPojo(rs.getInt(1), rs.getString(2), new AuthorPojo(rs.getInt(3),null,null),rs.getInt(6), LocalDate.parse(rs.getString(5)), rs.getString(4), rs.getString(7));
				allBooks.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allBooks;
	}

	@Override
	public Optional<BookPojo> fetchABook(int bookId) {
		Connection conn = DBUtil.makeConnection();
		Optional<BookPojo> bookOptional = Optional.empty();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBNativeSqlQueries.BOOK_FETCH_BY_ID);
			pstmt.setInt(1, bookId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				BookPojo book = new BookPojo(rs.getInt(1), rs.getString(2), new AuthorPojo(rs.getInt(3),null,null),rs.getInt(4), LocalDate.parse(rs.getString(5)), rs.getString(6), rs.getString(7));
				bookOptional = Optional.of(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookOptional;
	}

	@Override
	public List<BookPojo> fetchByBookGenre(String genre) {
		Connection conn = DBUtil.makeConnection();
		List<BookPojo> allBooks = new ArrayList<>(); // we will copy the rs in this collection
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBNativeSqlQueries.BOOK_FETCH_BY_GENRE);
			pstmt.setString(1, genre);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BookPojo book = new BookPojo(rs.getInt(1), rs.getString(2), new AuthorPojo(rs.getInt(3),null,null),rs.getInt(4), LocalDate.parse(rs.getString(5)), rs.getString(6), rs.getString(7));
				allBooks.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allBooks;
	}

	@Override
	public void removeBook(int bookId) {
		Connection conn = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBNativeSqlQueries.BOOK_DELETE);
			pstmt.setInt(1, bookId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		
		Connection conn = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBNativeSqlQueries.BOOK_ADD);
			pstmt.setString(1, newBook.getBookTitle());
			pstmt.setInt(2, newBook.getAuthor().getAuthorId());
			pstmt.setInt(3, newBook.getBookPrice());
			pstmt.setString(4, newBook.getBookPublished().toString());
			pstmt.setString(5, newBook.getBookGenre());
			pstmt.setString(6, newBook.getBookImageUrl());
			pstmt.executeUpdate();
			
			// we have to get the autogenerated primary key value
			String query = "select last_insert_id()";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			newBook.setBookId(rs.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		Connection conn = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBNativeSqlQueries.BOOK_UPDATE);
			pstmt.setInt(1, updateBook.getBookPrice());
			pstmt.setInt(2, updateBook.getBookId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateBook;
	}

}
