package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicProgramPractice451Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicProgramPractice451Application.class, args);
		/*Fabonacci Series
		int n=10;
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=3;i<n;i++) 
		{
			n3=n1+n2;
			System.out.print(n3);
			n1=n2;
			n2=n3;
		}
		*/
		/*
		 //check whether given number is prime number 
		int prime=125;
		int mid=prime/2,n1=0,n2=1;
		boolean flag=true;
		
		if(prime==n1||prime==n2)
			System.out.println("Given numbers are not prime");
		for(int i=2;i<mid;i++) 
		{
			if(prime%i==0&&prime!=n1&&prime!=n2) 
			{
				flag=false;
				
			}
			
		}
		if(flag==true&&prime!=n1&&prime!=n2)
		System.out.println("Given number "+prime+" is prime number");
		else
			System.out.println("Given number "+prime+" is not prime number");
			*/
		/*
		int n1=545;
		int sum=0,rem,temp=n1;
		
		while(n1>0) 
		{
			System.out.println("I am executing");
			rem=n1%10;
			sum=sum*10+rem;
			System.out.println(sum);
			n1=n1/10;
			
			
			
		}
		if(temp==sum)
			System.out.println("Given number "+temp+" is Palindrome");
		else
			System.out.println("Given number "+temp+" is not palindrome");
			*/
		
		//Factorial of a number 
		/*
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
			
			
		}
		System.out.println(fact);
		*/
		//Check whether given number is armstrong number or not 
		/*
		int n=407;
		for(int i=0;i<=n;i++) 
		{
			if(isArmstrong(i)) 
			System.out.println("Given number is Armstrong "+i);
			else 
				System.out.println(i+" is not Armstrong number ");
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	/*
	public static boolean isArmstrong(int n) {
		int digits=0,n1,last,sum=0;
		n1=n;
		while(n1>0) 
		{
			n1=n1/10;
			digits++;
		}
		n1=n;
		while(n1>0) 
		{
			last=n1%10;
			sum+=(Math.pow(last, digits));
			n1=n1/10;
			
		}
		if(sum==n)
		return true;
		else 
			return false;
	} */

}
