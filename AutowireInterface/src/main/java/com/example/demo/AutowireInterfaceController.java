package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutowireInterfaceController 
{
	@Autowired 
	@Qualifier("cat")
	AnimalInterface animalInterface;
	
	
	
	
	@RequestMapping("/")
	public void getSound( ) 
	{
		
		animalInterface.getSound();
		
		
	}

}
