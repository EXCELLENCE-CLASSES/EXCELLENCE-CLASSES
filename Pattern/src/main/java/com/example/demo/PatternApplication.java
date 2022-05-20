package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=5;j>=1;j--)
			{
				if(i!=j)
				System.out.print(j);
				else
					if(i==j)
					System.out.print("*");
			}
			System.out.println();
			
			
			
			
		}
		
		
	}

}
