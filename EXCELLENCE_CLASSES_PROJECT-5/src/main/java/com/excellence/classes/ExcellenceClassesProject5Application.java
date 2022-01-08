package com.excellence.classes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcellenceClassesProject5Application {

	public static void main(String[] args) {
		

		
		SpringApplication.run(ExcellenceClassesProject5Application.class, args);
		
		Map<String,Integer> mp=new HashMap<>() ;
		
			mp.put("arya", 201);
			mp.put("xyz", 202);
			
		
	}
}
