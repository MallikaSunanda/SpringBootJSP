package com.learning.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MyController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String home(Model model) {  
	  System.out.println("Accessing home page");
	  return "home.jsp";
	 }
	
}
