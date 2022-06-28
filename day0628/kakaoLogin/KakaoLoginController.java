package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KakaoLoginController {
	
  
	@GetMapping("/KaKaoLoginOK/{name}/{email}") //get userinfo through service calls
	public String loginOK(@PathVariable String name, @PathVariable String email, 
														HttpSession session) {
		ModelAndView mav = new ModelAndView("/loginOK"); //forward to loginOK html view page
		session.setAttribute("name", name); // keep login info on session
		session.setAttribute("email", email);
		return "loginOK";
	} //httpsession keeps login user info until logout.
}
