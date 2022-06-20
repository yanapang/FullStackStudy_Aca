package com.example.demo.controller;

import java.io.StringBufferInputStream;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.youiwe.webservice.BitSms;
import lombok.Setter;

@RestController
@Setter
public class MemberController {
	
	@Autowired
	//Sending email to new User
	private MailSender javaMailSender;
	
	@GetMapping("/sendMail")
	public String sendMail(String recipient) {
    //recipient's email address => input value
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		//Generate Authentication #. 4digits
		String no = "";
		Random r = new Random();
		no += r.nextInt(10);
		no += r.nextInt(10);
		no += r.nextInt(10);
		no += r.nextInt(10);
		
		//Setting mail
		mailMessage.setSubject("Title");
		mailMessage.setFrom("sender's@gmail.com");//sender'sgmail
		mailMessage.setText("Authentication number : "+ no); //email Content
		mailMessage.setTo(recipient);//recipient email address
		
		//Sending Mail
		try {
			javaMailSender.send(mailMessage);
		} catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
		
		return no;
	}
	 
	
	@GetMapping("/sendNUM")
	public String sendNUM(String to) {
		//Sender's number
		String from = "---";
		
		//4digit authentication number generator
		String no = "";
		Random r = new Random();
		no += r.nextInt(10);
		no += r.nextInt(10);
		no += r.nextInt(10);
		no += r.nextInt(10);
		
		//Sending Message
		BitSms sms = new BitSms();
		sms.sendMsg(from, to, no);
		
		return no;
	}
}
