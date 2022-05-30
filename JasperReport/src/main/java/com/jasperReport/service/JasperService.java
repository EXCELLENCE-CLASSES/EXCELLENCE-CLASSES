package com.jasperReport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jasperReport.model.Employee;
import com.jasperReport.repository.JasperRepository;

@Service
public class JasperService {
	
	@Autowired
	JasperRepository jsr;
	
	public List<Employee> getAllEmployee()
	{
		
		return jsr.findAll();
		
	}

}
