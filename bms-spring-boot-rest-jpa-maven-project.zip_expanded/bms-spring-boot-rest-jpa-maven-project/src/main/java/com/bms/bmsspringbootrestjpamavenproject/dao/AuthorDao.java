package com.bms.bmsspringbootrestjpamavenproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bmsspringbootrestjpamavenproject.dao.entity.AuthorEntity;

@Repository
public interface AuthorDao extends JpaRepository<AuthorEntity, Integer> {

}
