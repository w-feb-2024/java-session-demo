package com.bms.bmsspringbootrestjpamavenproject.exception;

public class BookNotFoundException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Book Not Found!";
	}

	
}
