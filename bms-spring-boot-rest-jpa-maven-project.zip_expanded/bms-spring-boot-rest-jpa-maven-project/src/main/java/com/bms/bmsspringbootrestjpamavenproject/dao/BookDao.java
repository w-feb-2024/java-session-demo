package com.bms.bmsspringbootrestjpamavenproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bmsspringbootrestjpamavenproject.dao.entity.BookEntity;

// by extending JpaRepository, we are using spring data jpa
// we dont have to create an implementation class for this interface
// beacause spring data jpa automaticatically provides the hibernate implementation class based 
		//on the generics provided by extending JpaRepository 
@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{
	// literaly here we have the basic CRUD methods
}
