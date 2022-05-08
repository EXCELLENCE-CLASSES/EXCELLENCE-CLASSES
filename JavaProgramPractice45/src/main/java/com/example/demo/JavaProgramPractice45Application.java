package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProgramPractice45Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaProgramPractice45Application.class, args);
		//Palindrome String 
	/*	String s1="Kayak";
		boolean flag=true;
		s1=s1.toLowerCase();
		for(int i=0;i<(s1.length()/2);i++)
		{
			if(s1.charAt(i)!=s1.charAt((s1.length())-i-1))
               flag=false;
			break;
       

		}
		if(flag)
			System.out.println("Given String is Palindrome");
		else if(!flag)
			System.out.println("Given String is not Palindrome");
			
		
	}
	*/
		/*
	//String Rotation
   String s1 = "abcde", s2 = "deabc";
	
	s1=s1.concat(s1);
	if(s1.indexOf(s2)!=-1)
		System.out.println("Given String is rotation of other String");
	else
		System.out.println("Given String is not rotation of other String}");
		*/
		/*
		
		String s1="Welcome To Excellence Classes";
		s1=s1.toLowerCase();
		int min,max;
		char ch[]=s1.toCharArray();
		int frq[]=new int[ch.length];
		  for(int i=0;i<ch.length;i++) 
		  {
			frq[i]=1;
		    for(int j=i+1;j<ch.length;j++) 
			     {
		            if(ch[i]==ch[j]&&ch[i]!=' '&&ch[i]!='0') 
				 {
		            frq[i]++;
		            ch[j]='0';
					
				 }
				
				
				
			}
			
		
		   }
		  char minChar=s1.charAt(0);
		  char maxChar=s1.charAt(0);
		  min=max=frq[0];
		  for(int i=0;i<frq.length;i++) 
		  {
			  if(min>frq[i]&&frq[i]!=0)
			  {
				 min=frq[i];
				  minChar=ch[i];
				  
			  }
			  if(max<frq[i]) 
			  {
				  max=frq[i];
				  maxChar=ch[i];
				  
			  }
			  
		  }
		  System.out.println("Minimum Character Occurence Is "+minChar);
		  System.out.println("Maximum Character Occurence Is "+maxChar);
		
		
		
		} */
	
	/* Reverse String */
	//Reverse String
		/*
	String s6="Welcome";
	
	char ch[]=s6.toCharArray();
	
	String sc="";
	char ch2[]=new char[ch.length];
	int len=s6.length();
	for(int i=ch.length-1;i>=0;i--) 
	{
		System.out.println(i);
		sc=sc+ch[i];
		
		
	}
	System.out.println(sc);
		
	}
	*/
		/*
		String s5="Welcome To Excellence Classes";
		s5=s5.toLowerCase();
		int count;
		char ch[]=s5.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]&&ch[i]!='0') {
					count++;
					ch[j]='0';
					
					
				}
				
				
				
				
				
			}
			
			if(count>1&&ch[i]!='0') 
			{
				System.out.println("Repeated Characters Are " +ch[i]);
				
			}
			
			
		} */
		/*
		String s5="Welcome To Excellence To Classes Brother Welcome";
		String ch[]=s5.split(" ");
		int count;
		for(int i=0;i<ch.length;i++) 
		{
			count=1;
			for(int j=i+1;j<ch.length;j++) 
			{
				if((ch[i].equals(ch[j]))) 
				{
					count++;
					ch[j]="0";
					
					
				}
				
				
			}
			if(count>1&&ch[i]!="0")
			System.out.println(ch[i]);
			
			
		}
		*/
		/*
		String s1="Welcome ";
		s1=s1.toLowerCase();
		
		char ch[]=s1.toCharArray();
		int freq[]=new int[ch.length];
		for(int i=0;i<ch.length;i++) 
		{
			freq[i]=1;
			
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j]&&ch[j]!='0') 
				{
					freq[i]++;
					ch[j]='0';
					
				}
				
			}
			
		}
		for(int i=0;i<freq.length;i++) 
		{
			if(ch[i]!=' '&&ch[i]!='0')
			System.out.println(ch[i]+" "+freq[i]);
			
		} */
		/*Maximum occurence of character
		String s1="Welcome To Excellence AAAAAAAAAAAAAAAAAAAAAAAAAAA Classes";
		s1=s1.toLowerCase();
		String str[]=s1.split(" ");
		int freq[]=new int[str.length];
		for(int i=0;i<str.length;i++) 
		{
			freq[i]=str[i].length();
			
			
		}
		String min=str[0],max=str[0],s2="",s3="";
		for(int i=0;i<str.length;i++) 
		{
			if(min.length()>str[i].length()) {
				min=str[i];
			s2=str[i];
			}
			if(max.length()<str[i].length()) 
			{
				max=str[i];
				s3=str[i];
			}
				
				
			
		}
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
		
		
			
		} */
		/*
		//Sepate Characters from String
		String s1="Welcome ";
		char c1[]=s1.toCharArray();
		for(int i=0;i<c1.length;i++) {
			
		System.out.println(c1[i]);
		} */
		/*
		
		String s1="Welcome To Excellence";
		
		
		
		
		
		String s2="Classes";
		
		
		s2=s1+s2;
		s2=s2.substring(0,s1.length());
		System.out.println(s2);
		*/
		//Program to swap string without third or temp variable
		/*
		
		String s1="Welcome To Excellence";
		String s2="Classes";
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		System.out.println(s1);
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
		
		*/
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	

}}
