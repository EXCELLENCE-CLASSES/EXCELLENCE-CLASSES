package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GarbageColletor1Application {

	public static void main(String[] args) {
		int count = 0;    
		String str = "He said, The mailman loves you. I heard 'it with my own ears.";    
		for (int i = 0; i < str.length(); i++)   
		{    
		//Checks whether given character is punctuation mark    
		if( str.charAt(i) == '\'' || str.charAt(i) == '\"' ) 
		  
		{
			System.out.println(str.charAt(i));
		count++;    
		}    
		}    
		System.out.println("The number of punctuations exists in the string is: " +count);    
		
	}

}
