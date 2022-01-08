package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcellenceClassesProject7Application {

	public static void main(String[] args) {
		SpringApplication.run(ExcellenceClassesProject7Application.class, args);
		AbstractClassImplementation ac=new AbstractClassImplementation();
		ac.method3();
		
		AbstractClassImplementation2  ab2=new AbstractClassImplementation2 ();
		
	}

}
