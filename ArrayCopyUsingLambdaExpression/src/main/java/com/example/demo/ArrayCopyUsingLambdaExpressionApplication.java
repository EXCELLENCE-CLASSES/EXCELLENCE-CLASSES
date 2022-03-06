package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@FunctionalInterface
interface CopyArray
{
public void copyArray(int[] ar3,int[] ar4);	
}



@SpringBootApplication
public class ArrayCopyUsingLambdaExpressionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrayCopyUsingLambdaExpressionApplication.class, args);
		
		int[] ar1= new int[]{12,25,30,45,60};
		int[] ar2=new int[ar1.length];
		
		CopyArray ca= (ar3,ar4)->
		{
			for(int i=0;i<ar3.length;i++ )
			{
				ar4[i]=ar3[i];
				
			}
			for(int i=0;i<ar3.length;i++)
			{
				System.out.println("value of ar3 is "+ar3[i]+" value of ar4 is "+ar4[i]);
			}
			
		};
		
		ca.copyArray(ar1, ar2);
		
		
		
		
		
		
		
	}

}
