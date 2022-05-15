package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaNamingProgrammeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaNamingProgrammeApplication.class, args);
		/*
		Scanner scn=new Scanner(System.in);
		System.out.println("Input number to be check for Krishnamurti number");
		int n=scn.nextInt();
		int rem,sum=0,temp=0,sum2=0;
		temp=n;
		while(n>0) 
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		System.out.println("Reverse number is "+sum);
		n=sum;
		
		while(n>0) 
		{
			rem=n%10;
			System.out.println(fact(rem));
			sum2+=fact(rem);
			n=n/10;
		}
		System.out.println("Sum2 value is "+sum2);
		System.out.println("value of sum is "+sum);
		if(temp==sum2) 
		System.out.println("Given number is Krishnamurti Number");
		else
			System.out.println("Given number is not Krishnamurti number"); */
		//Smith number 
		/*
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt(),rem,sum=0,sum2=0,prime=0,temp;
		temp=num;
		while(num>0) 
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
			
		}
		
		num=sum;
		int temp2=sum;
		while(num>0) 
		{
			rem=num%10;	
	
			
			
			sum2+=rem;
			num=num/10;
			
			
		}
		prime=primeFactors(temp2);
		
		if(sum2==prime) 
		
			System.out.println("Given number is Smith number "+temp);
		else 
			System.out.println("Given number is not Smith number "+temp);	 */
		//Emrip number 
		/*
		Scanner scn=new Scanner(System.in);
		System.out.println("Input number ");
		int revNum,num=scn.nextInt();
		boolean flag,flg2;
		flag=isPrime(num);
		if(flag)
		{
			revNum=rev(num);
			System.out.println(revNum);
			if(isPrime(revNum))
				System.out.println("Given number is Emirp");
			else
				System.out.println("Given number is not Emirp ");
			
		} */
		
		
		
			
		
	}
	/*public static boolean isPrime(int num) 
	{
		boolean flag=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) 
			{
				flag=false;
			}
		}
		return flag;
	}*/
	/* public static int rev(int n) 
	{
		int rem,sum=0;
		while(n>0) 
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		return sum;
	} */
	
	/* public static int fact(int n) 
	{
		int fact=1,mul=1;
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
		}
		return fact;
		
		
		
		
	}*/
	/*public static int primeFactors(int num) 
	{
		int sum=0;
		System.out.println("Prime factors of "+num+" are");
		for(int i=2;i<=num;i++)
		{
			if(!isPrime(i)) 
			{
				if(num%i==0) {
					sum+=sumOfDigits(i);
					
					System.out.println(i);
		            
				}
			}
			
		
		}
		System.out.println("Value of sum is "+sum);
		return sum;
	}*/
	/*public static int sumOfDigits(int num)
	{
		int sum=0,rem;
		while(num>0) 
		{
			rem=num%10;
			sum+=rem;
			num=num/10;
		}
		return sum;
	} 
	public static boolean isPrime(int num) 
	{
		boolean flag=false;
		if(num==2)
			return false;
		for(int i=3;i<num;i++) 
		{
			if(num%i==0)
				flag=true;
				
		}
		if(flag)
			return true;
		else
			return false ;
		
	} */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
