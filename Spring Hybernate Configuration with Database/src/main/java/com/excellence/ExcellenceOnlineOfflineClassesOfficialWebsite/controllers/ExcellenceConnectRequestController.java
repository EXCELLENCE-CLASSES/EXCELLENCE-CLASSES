package com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.models.ExcellenceClasses;
import com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.models.Student;
import com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.repositories.ExcellenceRepository;
import com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.repositories.StudentRepository;
import com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.services.ConnectRequestToExcellenceClasses;

@RestController
public class ExcellenceConnectRequestController {
	
	@Autowired
	private ExcellenceRepository excRepo ;
	
	@Autowired
	private StudentRepository stuRepo ;
	
	
	
	
	public ExcellenceClasses excellenceInfo(@RequestBody ConnectRequestToExcellenceClasses req)
	{
		return excRepo.save(req.getExcellenceInfo());
		
	}
	
	public List<Student> studentInfoInfo(@RequestBody ConnectRequestToExcellenceClasses req)
	{
		return stuRepo.findAll();
		
	}
	
	
	
}
	

	
	
	
	
	


