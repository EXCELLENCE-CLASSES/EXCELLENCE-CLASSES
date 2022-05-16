package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BouncyNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BouncyNumberApplication.class, args);
		//bouncing number
		/*
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		String str=Integer.toString(num);
		if(isIncreasing(str)||isDecreasing(str)||num<101) 
		System.out.println("Given number is not bouncing number");
		else
			System.out.println("Given number is bouncing number "); */
		//Strontio number
	/*	Scanner scn=new Scanner(System.in);
		System.out.println("Input 4 digits number");
		int num=scn.nextInt(),ones,tens,hundreds;
		int temp=num*2;
		System.out.println("temp" +temp);
		ones=temp%10;
		temp=temp/10;
		System.out.println("ones "+ones);
		tens=temp%10;
		temp=temp/10;
		System.out.println("tens "+tens);
		hundreds=temp%10;
		temp=temp/10;
		System.out.println("hundreds "+hundreds);
		if(tens==hundreds)
			System.out.println("Given number "+num+" is Strontio number");
		else
			System.out.println("Given number "+num+" is not strontio number"); */
		
			
			
		
	}
	
/*	public static boolean isIncreasing(String str) 
	{
		boolean flag=true;
		
		for(int j=0;j<str.length()-1;j++) 
		{
			if(str.charAt(j)>str.charAt(j+1))
			{
				flag=false;
			break;
			}
		}
		System.out.println("isIncreasing flag value is "+flag);
		return flag;
	}
	public static boolean isDecreasing(String str) 
	{
		boolean flag=true;
		for(int i=0;i<(str.length()-1);i++)
		{
			if(str.charAt(i)<str.charAt(i+1)) 
			{
				flag=false;
				break;
				
			}
		}
		System.out.println("Isdecreaing flag value is "+flag);
		return flag ;
		
	} */
} 
