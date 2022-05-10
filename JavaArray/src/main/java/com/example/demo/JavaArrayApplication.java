package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaArrayApplication.class, args);
	/*	int ch[]= {10,50,60,80,90};
		int ch2[]=new int[ch.length];
		for(int i=0;i<ch.length;i++) 
		{
			ch2[i]=ch[i];
		}
		for(int i=0;i<ch2.length;i++) 
		{
			System.out.println("content of new array are "+ch2[i]);
		} */
		//Programs for frequency of character 
		/*
		int ch[]={2,3,2,3,2,3,5};
		int freq[]=new int[ch.length];
		
		
		
		for(int i=0;i<ch.length;i++) 
		{
			freq[i]=1;
			
			
			for(int j=i+1;j<ch.length;j++) 
			{
				
				if((ch[i]==ch[j])&&ch[i]!='0') 
				{
					freq[i]++;
					ch[j]='0';
				}
				
				
				
			}
			
		}
		for(int i=0;i<freq.length;i++) 
		{
			if(ch[i]!='0') {
			System.out.println(ch[i]+" "+freq[i]);
			}
		}*/
		/*
		int ch[]= {10,20,30,40,50,60};
		int n=4; //number of times array needs to be rotated
		for(int i=0;i<ch.length;i++) 
		{
			System.out.print("Array elements before rotation are "+ch[i]);
			System.out.println();
		}
		int first,k;
		for(int j=0;j<n;j++) {
			System.out.println("Value of j is "+j);
			first=ch[0];
			for(k=0;k<ch.length-1;k++) {
				ch[k]=ch[k+1];
				
				
			}
			ch[k]=first;
		}
		
		//Array elements after rotation
		System.out.println("Printing elements after rotation");
		for(int i=0;i<ch.length;i++) 
		{
			System.out.println("Array elements after rotation are "+ch[i]);
		}
		
		*/
		/*
		int ch[]= {10,20,30,50,20,30,10,60,30};
		int dup[]=new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!='0') {
					
					dup[i]=ch[j];
					ch[j]='0';
				}
			}
		}
		for(int i=0;i<dup.length;i++) {
			if(dup[i]!=0) {
			
			System.out.println("Repeated characters are "+dup[i]);
			}
		}
		*/
		//Elements of an array
		/*  int aray[]= {20,30,50,30,20,50,30,20};
		  for(int i=0;i<aray.length;i++) 
		  {
			  System.out.println(aray[i]);
			  
		  }
		  */
		
		//Elements of an array in reverse order
		/*
		String s1[] ={"Mohan","Ram","Sohan","Ravi","Kavita"};
		for(int i=s1.length-1;i>=0;i--) 
		{
			System.out.println("Elements of array in reverse order are "+s1[i]);
			
		}
		*/
		
		//Elements which are at even position
		/*
		int aray[]= {10,30,10,20,30,10};
		for(int i=0;i<aray.length;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i);
				System.out.println("Elements which are at even positions are "+aray[i]);
				
			}
			
		}
		*/
		//Elements which are at odd position
		/*
		int ch[]= {20,30,50,70,90,40,70};
		for(int i=0;i<ch.length;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
				System.out.println(ch[i]);
			}
		}
		*/
		//Maximum value in a given array
		/*
		int aray[]= {10,50,90,220,70,101,115};
		int max;
		max=aray[0];
		for(int i=0;i<aray.length;i++) 
		{
			if(max<aray[i]) 
			{
				max=aray[i];
				
			}
		}
		System.out.println("maximum value in a array is "+max); 
		*/
		//Minimum value in a given array 
		/*
		int aray[]= {10,50,90,70,5,70,80};
		int min=aray[0];
		
		for(int i=0;i<aray.length;i++) 
		{
			if(min>aray[i]) {
				min=aray[i];
			}
			
		}
		System.out.println("Minimum value in a given array is "+min);
		*/
		/*
		int ar[]= {10,50,80,30,70,90};
		int sum=0;
		for(int i=0;i<ar.length;i++) 
		{
			sum+=ar[i];
		}
		System.out.println("Sum of elements in a array is "+sum);
		*/
		/*
		int ar[]= {5,20,30,10,50,20,30,70};
		int n=4,j;//Number of times array need to be rotated
		for(int i=0;i<n;i++) 
		{			
		int last=ar[ar.length-1];
		for(j=ar.length-1;j>0;j--) 
		{
			ar[j]=ar[j-1];
		}
		ar[j]=last;
		}
		for(int k=0;k<ar.length;k++) 
		{
			System.out.println("Rotated value of array is "+ar[k]);
		}
		*/
		/*
		int ar[]= {10,20,30,50,70,80,90,80};
		int temp=0;
		//Printing elements before sorting
		for(int i=0;i<ar.length;i++) {
			System.out.println("Elements before sorting "+ar[i]);
		}
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[j]<ar[i]) 
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
				
				
			}
		}
		//Printing elements after sorting
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println("Elements after sorting are "+ar[i]);
			
		}
		*/
		//Printing array elements in descending order
		/*
		int ch[]= {10,40,50,80,20,50,70};
		int temp=0;
		//Printing elements before sorting
		System.out.println("Printing elements before sorting");
		for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]);
		}
		System.out.println();
		for(int i=0;i<ch.length;i++) 
		{
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]<ch[j]) 
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("Printing elements after sorting");
		for(int i=0;i<ch.length;i++) 
		{
			System.out.print(ch[i]);
		}
		*/
		//3rd largest element in array
		/*
		int aray[]= {20,30,60,50,40,90,30,40,50,60,30};
		int temp=0;
		for(int i=0;i<aray.length;i++) {
			for(int j=i+1;j<aray.length;j++) {
				if(aray[i]<aray[j])
				{
					temp=aray[i];
					aray[i]=aray[j];
					aray[j]=temp;
					
				}
				
			}
		}
		for(int k=0;k<aray.length;k++) 
		{
			
			System.out.println("Elements of aray after sorting are "+aray[k]);
		}
		System.out.println("3rd Larsgest element is "+aray[2]);
		*/
		//Second highest element in a array 
		/*
		System.out.println("2nd Largest number in a array");
		int ch[]= {20,70,50,90,40};
		int temp=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]>ch[j]) 
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				
			}
		}
		for(int i=0;i<ch.length;i++) 
		{
			System.out.println("Elements of array in assecending array are "+ch[i]);
		}
		System.out.println("Second highest element of array is "+ch[ch.length-2]);
		*/
		//Maximum value in a array is :-
		/*
		int ch[]= {5,20,25,5,95,20,25,60,85,85};
		int max=0;
		
			for(int j=0;j<ch.length;j++) 
			{
				if(max<ch[j]) {
					max=ch[j];
				}
				
			}
			
			System.out.println("Maximum value in array is "+max);
			*/
		/*
		 //Removing dupliocate elements from an array
		   int aray[]= {10,5,10,20,5,10,5,10};
		   for(int i=0;i<aray.length;i++) {
			   for(int j=i+1;j<aray.length;j++) {
				   if(aray[i]==aray[j]) {
					   aray[j]='0';
				   }
			   }
		   }
		   for(int k=0;k<aray.length;k++) 
		   {
			   if(aray[k]!='0')
			   System.out.println("Elements is array after removing duplicate elements are "+aray[k]);
		   }
		   */
		//Priting odd and even values of an array
		/*
		int aray[]= {45,25,68,23,89,79};
		for(int i=0;i<aray.length;i++) {
			if(aray[i]%2==0)
			System.out.println("Even value of an array is "+aray[i]);
			else
				System.out.println("Odd value of an aray is "+aray[i]);
		}
		*/
		//Sorting array using sot() method of Arrays class 
		/*
		int aray[]= {10,79,45};
		Arrays.sort(aray);
		for(int i=0;i<aray.length;i++)
			System.out.println(aray[i]);
			
			*/
	
		
		
		
		
		
		
		
		
			
			
			
			
		}
	}

 
