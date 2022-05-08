package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProgramPractice3Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaProgramPractice3Application.class, args);
		   
		     
		 /*   //Remove all white space         
		        String str1="Remove white spaces";    
		            
		        //Removes the white spaces using regex    
		        str1 = str1.replaceAll("\\s+", "");    
		            
		        System.out.println("String after removing all the white spaces : " + str1);  */
		        
		 /* String str1="Great Power";    
		        StringBuffer newStr=new StringBuffer(str1);    
	            
		        for(int i = 0; i < str1.length(); i++) {    
		                
		            //Checks for lower case character    
		            if(Character.isLowerCase(str1.charAt(i))) {    
		                //Convert it into upper case using toUpperCase() function    
		                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
		            }    
		            //Checks for upper case character    
		            else if(Character.isUpperCase(str1.charAt(i))) {    
		                //Convert it into upper case using toLowerCase() function    
		                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
		            }    
		        }    
		        System.out.println("String after case conversion : " + newStr);  */
		
		/* StringBuffer sb=new StringBuffer("Welcome To Excellence Classes"); 
		for(int i=0;i<sb.length();i++) 
		if(Character.isLowerCase(sb.charAt(i)))
			sb.setCharAt(i,Character.toUpperCase(sb.charAt(i))  );
		
		else if(Character.isUpperCase(sb.charAt(i)))
			sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
		
		System.out.println(sb); */
		String s3="Welcome To Excellence Classes";
		
		char ch='k';
		
			
			s3=	s3.replace(' ',ch);
			
		
		System.out.println(s3);
		
		      
		  
		
	}

}
