package com.bms.bmsspringbootrestjpamavenproject.dao.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="author_details")
public class AuthorEntity {
	@Id
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="author_first_name")
	private String authorFirstName;
	
	@Column(name="author_last_name")
	private String authorLastName;
}
