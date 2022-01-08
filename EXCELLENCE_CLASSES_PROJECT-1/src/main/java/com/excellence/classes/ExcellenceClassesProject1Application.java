package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExcellenceClassesProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx=SpringApplication.run(ExcellenceClassesProject1Application.class, args);
	     Courses c1= cntx.getBean(Courses.class);
	     c1.setSeconday("I love Java");
	     System.out.println("here");
	     System.out.println(c1.getSeconday());
	     System.out.println("over");
	     
	     ExcellenceController c2 =cntx.getBean(ExcellenceController.class);
	     System.out.println("ExcellenceController Reference");
	     System.out.println(c2);
	    
	     System.out.println("I am executing ");
	  String s2= c2.method();
	  System.out.println("Bro");
	  System.out.println(s2);
	  
	  
	  System.out.println("Above done");
	  Author a1=cntx.getBean(Author.class);
	  a1.setA1("H.C Verma");
	  String s=c2.method2();
	  System.out.println(s);
	  
		 
	     
	}

}
