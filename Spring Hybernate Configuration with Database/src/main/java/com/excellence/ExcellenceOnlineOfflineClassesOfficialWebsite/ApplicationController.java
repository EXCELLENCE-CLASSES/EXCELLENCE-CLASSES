package com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	
    @RequestMapping("/welcome")
	public String goHome() 
	{
		return "home";
	}
	
	
	

}
