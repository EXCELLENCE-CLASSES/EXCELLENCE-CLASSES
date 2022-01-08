package com.excellence.classes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ExcellenceController3 {
	
	
	
	@RequestMapping("MyJspLink")	
	public ModelAndView method1(Courses c1)
	{
		System.out.println("I am getting printed");
		System.out.println(c1);
		
	ModelAndView mv=new ModelAndView();
	
	mv.addObject("abc", c1);
	mv.setViewName("NewFile");
		return mv;
	}
}
	
	
	
	
	
	
	
	
	


