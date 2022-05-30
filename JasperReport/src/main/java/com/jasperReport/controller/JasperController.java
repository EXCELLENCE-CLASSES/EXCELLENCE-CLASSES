package com.jasperReport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasperReport.model.Employee;
import com.jasperReport.service.JasperService;

@RestController
@RequestMapping("/")
public class JasperController {
	
	@Autowired
	JasperService jsp;
	
	
	
	@RequestMapping("/get")
	public List<Employee> getAll()
	{
		
		return jsp.getAllEmployee();
	}

}
