package com.excellence.classes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExcellenceController {

	
	
	@GetMapping("/register")
	public String StudentForm(Model m1) 
	{
		
		ExcellenceStudent student=new ExcellenceStudent() ;
		
	m1.addAttribute("student", student);		
		
		System.out.println("I am executing");
		
		
		return "student_registration" ;
		
	}
	
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("student") ExcellenceStudent student)
	{
		System.out.println(student.getName());
		System.out.println("I executed");
		return "registration_success";
	}
	
	
	
	
	
	
	
	
	
	

}
