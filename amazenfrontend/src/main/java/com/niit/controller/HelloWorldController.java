package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String message = "Welcome to Amazen!";
 
	@RequestMapping("/home")
	public ModelAndView showMessage() {
		
		
		ModelAndView mv = new ModelAndView("hh");
		return mv;
	}
}