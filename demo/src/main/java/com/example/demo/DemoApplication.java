package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	String s3=revStr("Mohan kumar");	
	System.out.println(s3);
	
	
	String str1 = "Good ", str2 = "morning ";    
    System.out.println("Strings before swapping: " + str1 + " " + str2);    
   
   str1=str1+str2;
   
   str2=str1.substring(0,(str1.length()-str2.length()) );
   str1=str1.substring(str2.length());
  
	
	
		
		
	}
	public static String revStr(String str) 
	{
		String[] s1=new String[30];
		s1=str.split(" ");
		for(int i=s1.length-1;i>=0;i--) 
		{
			System.out.print(s1[i]+" ");
			
		}
		return "";
	}
	
	 
	
	
	
	
	
	
	
	

}
