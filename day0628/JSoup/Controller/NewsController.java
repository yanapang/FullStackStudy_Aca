package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.NewsVO;

@Controller
public class NewsController {
	
	@GetMapping("/newsList")
	@ResponseBody
	public List<NewsVO> newsList(){
		//List returns JSON format data automatically
		List<NewsVO> newsList = new ArrayList<NewsVO>();
    
		try {
			Document doc = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LPOD&mid=sec&sid1=001&sid2=140&oid=001&isYeonhapFlash=Y&aid=0011845338").get();
			Elements list =doc.select("#main_content > div.list_body.newsflash_body").get(0).getElementsByTag("a");
			for(Element e:list){
				String title = e.text();
				String url = e.attr("href");
				newsList.add(new NewsVO(title, url));
			}
			
		} catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		return newsList;
	}
	
	
	@GetMapping("/news")
	@ResponseBody
	public String news() {
		//handmade JSON data using String 
		String str = "[";
		try {
			Document doc = Jsoup.connect("https://news.naver.com/main/list.nhn?mode=LPOD&mid=sec&sid1=001&sid2=140&oid=001&isYeonhapFlash=Y&aid=0011845338").get();

			Elements list =doc.select("#main_content > div.list_body.newsflash_body").get(0).getElementsByTag("a");
			for(Element e:list){
				String title = e.text();
				String url = e.attr("href");
				System.out.println("title:"+title);
				System.out.println("url:"+url);
				
				str+="{'title':"+title+", 'url':"+url+"},";
			}
			
			str = str.substring(0, str.length()-1);//get rid of last comma using substr
			
		} catch(Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
		str += "]";
		
		return str;
	}
}
