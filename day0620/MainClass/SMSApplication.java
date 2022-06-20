package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kr.co.youiwe.webservice.BitSms;

@SpringBootApplication
public class JstestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JstestApplication.class, args);
		
		//sending message;
		BitSms bitSms = new BitSms();
		bitSms.sendMsg("sender'sPhone#", "receiver'sPhone#", "Message");
		//in case message sending procedure finished with success;
		System.out.println("OK");
	}

}
