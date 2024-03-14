package com.bms.bmsspringbootrestjpamavenproject.dao.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="book_details")
public class BookEntity {
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	// we treated bookAuthorIs as an ordinarly column like other columns
	// we have not used relation mapping on the foreign key column bookAuthorId
//	@Column(name="book_author_id")
//	private int bookAuthorId;
	
	@ManyToOne
	@JoinColumn(name="book_author_id")
	AuthorEntity author;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_published")
	private LocalDate bookPublished;
	
	@Column(name="book_cost")
	private Integer bookPrice;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
}
