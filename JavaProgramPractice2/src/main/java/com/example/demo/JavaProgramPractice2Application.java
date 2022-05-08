package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProgramPractice2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaProgramPractice2Application.class, args);
		
		//Convert String in n equal parts
	/*String s2="Welcome to Excellence Online&Offline Classes";
	
	int len=(s2.length()),temp=0;
	int len2=len;
	s2=s2.toLowerCase();
	String[] s8=new String[100];
	if(len2%2!=0) {System.out.println("String Can't be divided");}
	for(int i=0;i<len;i=i+(len2/2))
	{
		s8[temp++]=s2.substring(i, i+(len2/2));	
		
		
		
	}
	for(int j=0;j<temp;j++) 
	{
		System.out.println(s8[j]);
	}
	*/
	//Subset of string
		/*
	String s5="Welcome To Excellence Classes";
	int temp=0,len=(s5.length()*(s5.length()+1)/2);
	String[] s6=new String[len];
	for(int i=0;i<s5.length();i++) 
	{
		for(int j=i;j<s5.length();j++) 
		{
			s6[temp++]=s5.substring(i,j+1);
			
			
			
		}
		
		
		
		
	}
	for(int k=0;k<len;k++)
	{
		System.out.println(s6[k]);
	}
	*/
	/*	 String str = "acbdfghybdf";  
	        String lrs="";  
	        int n = str.length();  
	        for(int i = 0; i < n; i++){  
	            for(int j = i+1; j < n; j++){  
	                //Checks for the largest common factors in every substring  
	                String x = lcp(str.substring(i,n),str.substring(j,n));  
	                //If the current prefix is greater than previous one  
	                //then it takes the current one as longest repeating sequence  
	                if(x.length() > lrs.length()) lrs=x;  
	            }  
	        }  
	        System.out.println("Longest repeating sequence: "+lrs);  
	        } */
	    /* 
		String s5="acbdfghybdf" ;
		String s6="";
		int n=s5.length();
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
		 		String lcs2=lowestRepSeq(s5.substring(i, n),s5.substring(j, n));
				if(lcs2.length()>s6.length()) 
				{
					s6=lcs2;
					
				}
				
			}
			
		} 
		System.out.println("Hello");
		System.out.println(s6);
		
		
		
		
		
		
		
	    }   
	    
	    
	  
	
	public static String lcp(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
        
    }  
	public static String lowestRepSeq(String s1,String s9) 
	{
		int min=Math.min(s1.length(),s9.length());
		
		for(int i=0;i<min;i++) 
		{
			if(s1.charAt(i)!=s9.charAt(i)) 
			{
				return s1.substring(0,i);
				
			}
			
		}
		return s1.substring(0,min);
		
	}
	
	
	
	
	
	
	
    }*/
		 
		   
		     
		        String str = "ABC";    
		        int len = str.length();    
		        System.out.println("All the permutations of the string are: ");    
		        generatePermutation(str, 0, len);    
	}
		       
		        
		   
		    public static String swapString(String a, int i, int j) {    
		        char[] b =a.toCharArray();    
		        char ch;    
		        ch = b[i];    
		        b[i] = b[j];    
		        b[j] = ch;    
		        return String.valueOf(b);    
		    }
		    //Function for generating different permutations of the string    
		    public static void generatePermutation(String str, int start, int end)    
		    {    
		        //Prints the permutations    
		        if (start == end-1)    
		            System.out.println(str);    
		        else    
		        {    
		            for (int i = start; i < end; i++)    
		            {    
		                //Swapping the string by fixing a character    
		                str = swapString(str,start,i);    
		                //Recursively calling function generatePermutation() for rest of the characters     
		                generatePermutation(str,start+1,end);    
		                //Backtracking and swapping the characters again.    
		                str = swapString(str,start,i);    
		            }    
		        }    
		    } 
		        
		}    



