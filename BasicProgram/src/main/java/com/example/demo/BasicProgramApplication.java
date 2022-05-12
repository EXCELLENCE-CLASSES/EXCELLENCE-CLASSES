package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicProgramApplication.class, args);
		//Reverse of a number
		/*
		int n=945,r,sum=0;
		while(n>0) 
		{
			r=n%10;
			// System.out.println(r);
			
			sum=(sum*10+r);
			System.out.println(sum);
			n=n/10;
			
		}
		System.out.println("Reverse of number is "+sum); */
		//Gcd of 2 number
		/*
	    Scanner scn=new Scanner(System.in);
	    int num1=scn.nextInt();
	    int num2=scn.nextInt();
	    int max=0;
	    for(int i=1;i<=num1;i++) 
	    {
	    	if(num1%i==0&&num2%i==0) 
	    	{
	    		max=i;
	    		// System.out.println(i);
	    	}
	    	
	    }
	    System.out.println(    "gcd(" +num1+","+num2+ ")="+max );
	    */
		//Check for perfect square
		/*
		Scanner scn=new Scanner(System.in);
		double sqrtNum1Floor,sqrtNum1,num1=scn.nextInt();
		sqrtNum1=Math.sqrt(num1);
		sqrtNum1Floor=Math.floor(sqrtNum1);
		if((sqrtNum1Floor-sqrtNum1)==0) 
			System.out.println("Given number is perfect square49");
		
		else
			System.out.println("Given number is not perfect square");
			*/
		//Sum of natural number
		/*
		int num1,sum=0;
	    Scanner scn=new Scanner(System.in);
	    num1=scn.nextInt();
	    for(int i=1;i<=num1;i++) 
	    sum+=i;
	    System.out.println("sum of natural numbers are "+sum);
	    */
		//First 100 even or odd natural number
		/*
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		for(int i=1;i<=num1;i++) {
			if(i%2==0) 			
				System.out.println(" Number is even "+i);
				else 
					System.out.println(" Number is odd "+i);
					*/
		//Other way to find square root of a number 
		/*
		double n = 16;  
		//calling the method and prints the result  
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
		}  
	

		//user-defined method that contains the logic to find the square root  
		public static double squareRoot(double num)   
		{  
		
		double sqrt=num/2,t;
		
		do 
		{
		t=sqrt;
		sqrt=(t+(num/t))/2;
			
			
			
			
		}while((t-sqrt)!=0);
			
			
			System.out.println("Sqrt is"+sqrt);
			return sqrt;
		*/
		//Check for positive or negative number
		/*
		int num=0;
		if(num>0)
			System.out.println("Given number is positive "+num);
		else if(num<0)
			System.out.println("Given number is nergative "+num);
		else
			System.out.println("Given number is equal to 0 ");
			*/
		//Largest of 3 numbers
		/*
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt(),b=scn.nextInt(),c=scn.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println("A is largest "+a);
			else
				System.out.println("C is largest "+c);
		}
		else 
			if(b>c)
				System.out.println("b is largest ");
			else
				System.out.println("C is largest");
		*/
			  
		
		
		
		
		
		
		
		}
		
			
		
		
		
		
		
		
		
		
		
	    		
	    
	    
		
		
		
		
	}


