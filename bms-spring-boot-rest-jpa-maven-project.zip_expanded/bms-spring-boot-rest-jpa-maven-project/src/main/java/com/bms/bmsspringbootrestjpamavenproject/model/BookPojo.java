package com.bms.bmsspringbootrestjpamavenproject.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
