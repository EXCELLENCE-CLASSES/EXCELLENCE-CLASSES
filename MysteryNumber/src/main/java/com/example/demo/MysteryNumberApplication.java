package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysteryNumberApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MysteryNumberApplication.class, args);
		
		// Mystery number 
		/*
		System.out.println("Input number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int revOfNum;
		for(int i=1;i<num/2;i++) 
		{
			revOfNum=rev(i);
			if(i+revOfNum==num) {
				System.out.println("value of i is "+i+" and value of revOfSum is "+revOfNum);
				System.out.println("Given number "+num+" is a Mystery number");
			}
			
			
		}
		sc.close(); */
	}
	/* public static int rev(int num) 
	{
		int rev=0,rem;
		while(num>0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
		
	}*/

}
