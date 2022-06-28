package com.example.demo.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcRateController {

	@GetMapping("/AudtoWon")
	public String AudtoWon() {
		String r = "";
		
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/marketindex/exchangeDetail.nhn?marketindexCd=FX_AUDKRW").get();
			//System.out.println(doc);
			Elements e =doc.select("#content > div.section_calculator > table:nth-child(4) > tbody > tr > td:nth-child(1)");
			System.out.println("Current Element: "+ e.text() );
			r = e.text();
			
		} catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		
		return r;
	}
}
