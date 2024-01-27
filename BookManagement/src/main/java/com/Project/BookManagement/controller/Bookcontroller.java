package com.Project.BookManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Project.BookManagement.DAO.BookDAO;
import com.Project.BookManagement.model.Bookmodel;

@Controller
public class Bookcontroller {
	
	@Autowired
	BookDAO bookdao;
	
	@RequestMapping("save")
	public String savedetails(Bookmodel book) {
		bookdao.save(book);
		return "index.jsp";
		
	}

}
