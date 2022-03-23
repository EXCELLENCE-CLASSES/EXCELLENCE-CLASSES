package com.example.demo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavaProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJavaProgramApplication.class, args);
		
	
		String s1="WelecomeToExcellenceClasses";
		
		s1=s1.toLowerCase();
		
		System.out.println(s1.length());
		
		
		
		int len=s1.length();
		
		int index=0,n=(s1.length()/9),p=9;
		
		System.out.println(n);
		
		if(s1.length()%9!=0)
			System.out.println("Undivisible");
		
		String[] s2=new String[p];
		
		
		System.out.println("Equal Substrings Are");
		
		for(int i=0;i<len;i+=n) 
		{
			
			String subString=s1.substring(i, i+n);
			System.out.println(subString);
			
			s2[index]=subString ;
			System.out.println("index is "+index);
			
			index++;
			
		}
		
		System.out.println("Equal Substrings Are");
		for(int k=0;k<(s2.length);k++) 
		{
			System.out.println("N equal parts substring are");
			System.out.println(s2[k]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
