package com.example.demo.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	@GetMapping("/seat")
	public String seat() {
		String r="";
		
		try {
			Document doc = Jsoup.connect("http://mpllc-seat.sen.go.kr/seatinfo/Seat_Info/1_count.asp").get();
			//System.out.println(doc);
			Elements e =doc.select("#Layer110 > table > tbody > tr > td.wating_f ");
			System.out.println("Current Element: "+ e.text() );
			r = e.text();
			
		} catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		return r;
	}
}
