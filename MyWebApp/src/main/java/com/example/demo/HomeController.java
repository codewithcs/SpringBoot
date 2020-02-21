package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("home")
	public String home(HttpServletRequest req) { 
		System.out.println("Home function");
		
		HttpSession session = req.getSession(); 
		
		String name = req.getParameter("name"); 
		
		session.setAttribute("name", name); 
		
		System.out.println("Name is " + name );
		
		return "home";
	}
	// When request is for "home", we want to execute home() function. 
	
	/*
	 The location of home.jsp is specified in spring boot. In the configuration, it is 
	 mentioned that the pages will be in src/main/webapp directory. 
	 */
}
