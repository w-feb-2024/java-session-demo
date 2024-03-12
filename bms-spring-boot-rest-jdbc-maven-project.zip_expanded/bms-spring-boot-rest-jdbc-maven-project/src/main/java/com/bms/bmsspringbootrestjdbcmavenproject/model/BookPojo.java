package com.bms.bmsspringbootrestjdbcmavenproject.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class BookPojo {
	
	private int bookId;
	
	@NotNull
	private String bookTitle;
	
	@NotNull
	private AuthorPojo author;
	
	@NotNull
	private String bookGenre;
	
	private LocalDate bookPublished;
	
	private Integer bookPrice;
	
	private String bookImageUrl;
	
	public BookPojo(int bookId, String bookTitle, AuthorPojo author, String bookGenre, LocalDate bookPublished,
			int bookPrice, String bookImageUrl) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.bookGenre = bookGenre;
		this.bookPublished = bookPublished;
		this.bookPrice = bookPrice;
		this.bookImageUrl = bookImageUrl;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public AuthorPojo getAuthor() {
		return author;
	}

	public void setAuthor(AuthorPojo author) {
		this.author = author;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookGenre, bookId, bookImageUrl, bookPrice, bookPublished, bookTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BookPojo other = (BookPojo) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookGenre, other.bookGenre)
				&& bookId == other.bookId && Objects.equals(bookImageUrl, other.bookImageUrl)
				&& bookPrice == other.bookPrice && Objects.equals(bookPublished, other.bookPublished)
				&& Objects.equals(bookTitle, other.bookTitle);
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", bookGenre="
				+ bookGenre + ", bookPublished=" + bookPublished + ", bookPrice=" + bookPrice + ", bookImageUrl="
				+ bookImageUrl + "]";
	}
}
