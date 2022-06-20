
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDAO;
import com.example.demo.vo.BookVO;

import lombok.Setter;

@RestController
@Setter
public class BookController {
	
	@Autowired
	private BookDAO dao;
	
	//CRUD service mapped with jqGrid and DataBase (Oracle)
	@RequestMapping("/updateBook")
	public String update(String oper, BookVO b) {
		
		System.out.println("oper:"+oper);
		System.out.println(b);
		
		if(oper.equals("add")) {//operand sent by jqGrid
			dao.insertBook(b);
		}else if(oper.equals("edit")) {
			dao.updateBook(b);
		}else if(oper.equals("del")) {
			dao.deleteBook(b.getBookid());
		}
		return "OK";
	}
	
	@GetMapping(value = "/listBook", produces = "application/xml")
	public String list() {
		List<BookVO> list = dao.listBook();
		String str = "";
		str += "<rows>";
		str += "<page>1</page>";
		str += "<total>1</total>";
		str += "<records>10</records>";
		for(BookVO b: list) {
			str += "<row>";
			str += "<cell>"+b.getBookid()+"</cell>";
			str += "<cell>"+b.getBookname()+"</cell>";
			str += "<cell>"+b.getPublisher()+"</cell>";
			str += "<cell>"+b.getPrice()+"</cell>";
			str += "</row>";
		}
		str += "</rows>";
		
		return str;
	}
}
