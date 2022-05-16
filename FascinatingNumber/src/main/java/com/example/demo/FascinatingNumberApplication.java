package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FascinatingNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(FascinatingNumberApplication.class, args);
		//Fascinating number
		/*
		int num,first,second,digit;
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		first=num*2;
		second=num*3;
		String s1=Integer.toString(num);
		String s2=Integer.toString(first);
		String s3=Integer.toString(second);
		String concate=s1+s2+s3;
		boolean present[]=new boolean[10];
		int len=concate.length();
		for(int i=0;i<len;i++) 
		{
			if(isDigit(concate.charAt(i))) 
			{
				digit=concate.charAt(i)-'0';
				present[digit]=true;
				
				
			}
			
		}
		boolean flag=false;
		for(int i=1;i<9;i++) 
		{
			if(present[i]!=true) 
			{
				flag=true;
			    break;
			}
			
			
		}
		if(flag)
			System.out.println("Given number is not fascinating number");
		else
			System.out.println("Given number is fascinating number "); */
		
	}
	/*public static boolean isDigit(char ch) 
	{
		if(ch>'0' && ch<'9') 
		{
			System.out.println("Given character is digit"+ch);
			return true;
		}
		return false;
		
	} */

}
