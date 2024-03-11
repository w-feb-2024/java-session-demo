package com.sample.springbootrestmavendemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// to work with lombok 2 things should be done. 
// 1. add the lombok dependency in pom.xml
// 2. in the ide, add the lombok plugin

@Data
@NoArgsConstructor
@AllArgsConstructor

//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
public class StudentPojo {
	private int studId;
	private String studName;
	private int studScore;
}
