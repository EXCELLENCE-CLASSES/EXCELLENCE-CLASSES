package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProgramPracticeApplication {

	public static void main(String[] args) {
		
		//Program to count total number of characters 
		SpringApplication.run(JavaProgramPracticeApplication.class, args);
		String s1="Hello!Welcome to Excellence Classes";
		int count=0,count2=0,vCount3=0,vConstCount=0;
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)!=' ') 
			{
				count++;
			}
			
		}
		System.out.println("Value of count is "+count);	
		//Program to count total number of punctuation marks
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)==','||s1.charAt(i)=='.'||s1.charAt(i)=='?'||s1.charAt(i)=='!'||s1.charAt(i)==';'||s1.charAt(i)=='\"'||s1.charAt(i)=='\"'||s1.charAt(i)=='-') {}
		    count2++;	
		
		}
		System.out.println("Value of count2 is "+count2);
		for(int j=0;j<s1.length();j++) 
		{
			// Checking if given character is Vowel
			if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u') 
			{
				vCount3++;
				
			}
			else 
				// Checking if given character is not vowel(a,e,i,o,u) then it is Consonant if ascii value lie between 97(a) and 122(z)  
				if(s1.charAt(j)>='a'&&s1.charAt(j)<='z') {vConstCount++;}
			
		}
		System.out.println("Value of vCount3 is "+vCount3);
		System.out.println("Value of vConstCoun is "+vConstCount);
		
		
	}
	
}
