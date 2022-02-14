package com.excellence.OnlineOfficialWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public void saveExcellenceClasses(@RequestBody ExcellenceService excServ )
	{
		excRepo.save(excServ.getExcellenceDetails());
		
		
	} 
	
	

}
