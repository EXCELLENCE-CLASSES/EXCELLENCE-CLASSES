package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excellence.classes.BasicAnnotation.ExtendBasicAnnotation;

@SpringBootApplication
public class ExcellenceClassesProject6Application {

	public static void main(String[] args) {
		SpringApplication.run(ExcellenceClassesProject6Application.class, args);
		
		ExtendBasicAnnotation e1=new ExtendBasicAnnotation();
		e1.method1();
	}

}
