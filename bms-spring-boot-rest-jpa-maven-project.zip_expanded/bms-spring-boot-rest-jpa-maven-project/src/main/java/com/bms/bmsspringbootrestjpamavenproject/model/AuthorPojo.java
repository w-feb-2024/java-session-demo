package com.bms.bmsspringbootrestjpamavenproject.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorPojo {
	private int authorId;
	private String authorFirstName;
	private String authorLastName;
	List<BookPojo> allBooks;
}
