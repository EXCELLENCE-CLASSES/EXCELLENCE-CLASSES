package com.excellence.classes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcellenceClassController {
	
	@RequestMapping("/")
	public String HomePage() 
	{
		return "Excellence.jsp";
	}

}
