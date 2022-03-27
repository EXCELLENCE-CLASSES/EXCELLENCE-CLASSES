package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApplication {

	public static void main(String[] args) {
		
		//map
		SpringApplication.run(StreamApplication.class, args);
		String[] str= {"abc","def","ghi","dfygfg","jhgbhjg"};
		String[] arr=Arrays.stream(str).map(e -> e.toUpperCase()).toArray(String[]::new);
		//Map will return Stream of string(sequence of object of string)
		
		System.out.println(Arrays.toString(str));
		
		//filter
		String[] array2=Arrays.stream(str).filter(e -> e.length()>3).map(e ->e.toUpperCase()).toArray(String[]::new);
		
		System.out.println(Arrays.toString(array2));
		
		//Reduce
		String CombinationOfAllStrings=Arrays.stream(str).reduce("", (name1,name2) -> name1+name2);
		
		System.out.println(CombinationOfAllStrings);
		
		//Reduce 
		Integer[] integ= {2,3,4,5,7}; int sum=Arrays.stream(integ).reduce(0,(num1,num2)-> num1+num2);
		
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
