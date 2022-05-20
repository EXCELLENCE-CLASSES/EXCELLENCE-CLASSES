package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pattern3Application {

	public static void main(String[] args) {
		SpringApplication.run(Pattern3Application.class, args);
		int  sum=0;
		
		for(int i=1;i<=10;i++) 
		{
		
			
			for(int j=1;j<=i;j++) 
			{
				
				
				sum=i*j;
				
				System.out.print("\t"+sum);
			}
			System.out.println();
		}
	}

}
