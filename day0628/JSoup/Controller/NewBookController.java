package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.BookVO;

@RestController
public class NewBookController {
	@GetMapping("/newBookList")
	public List<BookVO> newBookList(){
		List<BookVO> bookList = new ArrayList<BookVO>();
		
		String url="https://www.hanbit.co.kr/store/books/new_book_list.html";
		String r ="";
		
		try {
      
			Document doc = Jsoup.connect(url).get();
			//System.out.println(doc);
			Elements list = doc.getElementsByClass("book_tit");
			
			for(Element e:list) {
				Element a = e.getElementsByTag("a").get(0);
				String title = a.text();
				String link = a.attr("href");
				bookList.add(new BookVO(title, link));
				
			}
		}catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		return bookList;
	}
}
