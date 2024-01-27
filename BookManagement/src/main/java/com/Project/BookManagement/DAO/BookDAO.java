package com.Project.BookManagement.DAO;

import org.springframework.data.repository.CrudRepository;

import com.Project.BookManagement.model.Bookmodel;

public interface BookDAO extends CrudRepository<Bookmodel,Integer>{
	

}
