package com.bms.bmsspringbootrestjdbcmavenproject.exception;

public class BookNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Book Not Found!";
	}

	
}
