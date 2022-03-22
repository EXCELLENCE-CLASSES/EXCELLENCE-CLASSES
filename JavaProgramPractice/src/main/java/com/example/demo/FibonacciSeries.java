package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@FunctionalInterface
interface Interf
{
   public void method1(int k);	
}
@SpringBootApplication
public class FibonacciSeries {
	
	/*public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    } */  
	
	public static int linearSearch(int[] arr,int key) 
	{
		for(int i=0;i<arr.length;i++)
			
			if(arr[i]==key) return i ;
		return -1;
		
		
		
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(FibonacciSeries.class, args);
		
		int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
       System.out.println(key+" is found at index: "+linearSearch(a1, key));    
        
        
		
	
		
		Interf i= k->
		{		
			            int n1=0,n2=1,n3 ;
		                  System.out.println(n1);
		                  System.out.println(n2);
			
		         for(int p=3;p<=k;p++) 
			     {
				  n3=n1+n2;
				  System.out.println(n3);
				  n1=n2;
				  n2=n3;
			      }
		               };   
		               i.method1(10);
		               
		               
		               
		               
		               
		String s1="Hello! Welcome To Excellence Classes";
		int count=0;
		
		
		for(int p=0;p<s1.length();p++) 
		{
			if(s1.charAt(p)==' ') 
			{
				count++;
			}
			
		}
		System.out.println("Value of count is "+ count);
		
		
		//Stores the count of punctuation marks    
		int count2 = 0;    
		String str = "He;-?saidThemailmanlovesyouIhearditwithmyownears";    
		
		for(int v=0;v<str.length();v++) 
		{
			if(str.charAt(v)==' ' || str.charAt(v)=='\"'||str.charAt(v)=='\''||str.charAt(v)=='?'||str.charAt(v)=='-'||str.charAt(v)==':'||str.charAt(v)==';') 
		      count2++ ;	
		
		}
		
		System.out.println("Number of punctuation marks is "+count2);
		
		
		String s3="Welcome to Excellence Classes" ;
		s3=s3.toLowerCase();
		System.out.println(s3);
		int vCount=0;
		int cCount=0;
		
		for(int h=0;h<s3.length();h++) 
		{
			
			if(s3.charAt(h)=='a'||s3.charAt(h)=='e'||s3.charAt(h)=='i'||s3.charAt(h)=='o'||s3.charAt(h)=='u')
				vCount++;
			else if(s3.charAt(h)>='a'&&s3.charAt(h)<='z')
			cCount++;
			
			
			
		}
	
	System.out.println(vCount);
	System.out.println(cCount);
		
		
	}}

	
	

