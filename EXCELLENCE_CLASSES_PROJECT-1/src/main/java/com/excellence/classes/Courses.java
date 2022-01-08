package com.excellence.classes;

import org.springframework.stereotype.Component;


@Component
public class Courses {
	
	String  seconday ;
	String  seniorSecondary ;
	
	
	Courses()
	{
		System.out.println("Object Created");
	}
	public String getSeconday() {
		System.out.println("I called xxxxx");
		System.out.println("Hello"+seconday);
		return seconday;
	}
	public void setSeconday(String seconday) {
		System.out.println("I called 2 ");
		this.seconday = seconday;
		System.out.println(seconday);
	}
	public String getSeniorSecondary() {
		return seniorSecondary;
	}
	public void setSeniorSecondary(String seniorSecondary) {
		this.seniorSecondary = seniorSecondary;
	}
	
	
	
	
	
	
	

}
