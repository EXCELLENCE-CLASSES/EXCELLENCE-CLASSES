package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@FunctionalInterface
interface Square
{
public int squareOf(int n);	
}
@SpringBootApplication
public class SquareOfANumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquareOfANumberApplication.class, args);
		
		Square sq= n->n*n;
		int k=sq.squareOf(10);
		System.out.println(k);
		
		
		
		
		
		
		
	}

}
