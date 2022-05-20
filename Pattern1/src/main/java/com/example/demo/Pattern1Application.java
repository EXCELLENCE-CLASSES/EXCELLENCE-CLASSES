package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pattern1Application {

	public static void main(String[] args) {
		SpringApplication.run(Pattern1Application.class, args);
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int j;
		
		for(int i=1;i<=num;i++) 
		{
			for(j=1;j<=num;j++) 
			{
			       if(i!=j)
			    	   System.out.print('0');
			       else 
			           System.out.print("*");
			}
			j--;
			System.out.print("*");
			for(int p=j;p>=1;p--) 
			{
				if(p!=i)
					System.out.print('0');
				else
					System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
	}

}
