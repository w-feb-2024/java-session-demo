package com.bms.bmsspringbootrestjpamavenproject.model;

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
}
