package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoveDuplicateNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoveDuplicateNumberApplication.class, args);
		int aray[]= {2,2,2,3,5,6,5,8,5,3,5,3,6,5};
		for(int i=0;i<aray.length;i++) {
			for(int j=i+1;j<aray.length;j++) {
				if(aray[i]==aray[j]&&aray[i]!='0'&&aray[i]!=' ') {
					aray[j]='0';
				}
			}
		}
		System.out.println(" Elements after removing duplicate elements ");
		for(int i=0;i<aray.length;i++) 
		{
			if(aray[i]!='0') {
				System.out.print(" "+aray[i]+" ");
			}
			
		}
		
		
	}

}
