package com.excellence.OnlineOfficialWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.excellence.OnlineOfficialWebsite.model.ExcellenceClassesDetails;
import com.excellence.OnlineOfficialWebsite.repository.ExcellenceClassesDetailsRepository;
import com.excellence.OnlineOfficialWebsite.repository.ExcellenceStudentDetailsRepository;
import com.excellence.OnlineOfficialWebsite.repository.ExcellenceTeacherDetailsRepository;
import com.excellence.OnlineOfficialWebsite.service.ExcellenceService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RestController
public class ExcellenceController {
	
	@Autowired
	ExcellenceClassesDetailsRepository excRepo ;
	
	@Autowired
	ExcellenceStudentDetailsRepository excStuRepo ;
	
	@Autowired
	ExcellenceTeacherDetailsRepository excTchRepo ;
	
	@PostMapping("/saveExcellence")
	public void saveExcellenceClasses(@RequestBody ExcellenceClassesDetails excServ )
	{
		System.out.println("hello");
		System.out.println(excServ);
		excRepo.save(excServ);
		
		
	}
	@RequestMapping("/abc")	
	public ModelAndView registrationPage() 
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("abc.html");
		
		return mv;
	}
	
	

	

}
