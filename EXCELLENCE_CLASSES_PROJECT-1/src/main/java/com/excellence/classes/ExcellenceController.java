package com.excellence.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ExcellenceController {
	
	String branch ;
	
	@Autowired
	Courses c1;
	
	@Autowired
	@Qualifier("kg")
	Author ag;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String method()
	{
		System.out.println("I am executing");
		System.out.println(c1);
		System.out.println("hello");
		
	
	      String s1=c1.getSeconday() ;
	      return s1;
	
	}
	public String method2()
	{
	String s2=ag.getA1();
	return s2;
	}
	
		
	
	
	

}
