package com.bms.bmsspringbootrestjpamavenproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bms.bmsspringbootrestjpamavenproject.dao.entity.BookEntity;

// by extending JpaRepository, we are using spring data jpa
// we dont have to create an implementation class for this interface
// beacause spring data jpa automaticatically provides the hibernate implementation class based 
		//on the generics provided by extending JpaRepository 
@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{
	// literaly here we have the basic CRUD methods
	
	// using query method - here method name matters
	// List<BookEntity> findByBookGenre(String genre);
	
	//or
	
	//  using jpql with @Query annotation - here method name does not matter
	@Query(name="select b from BookEntity b where b.bookGenre=?1")
	List<BookEntity> getAllBooksByGenre(String genre);
	
	//or
//	@Query(name="select * from book_details where book_genre=?1",nativeQuery = true)
//	List<BookEntity> getAllBooksByGenre(String genre);
}
