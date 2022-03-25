package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8StreamApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Java8StreamApplication.class, args);
		
		//1.Integer Stream
		IntStream
		.range(1,10)
		.forEach(System.out::print);
		System.out.println();
		//2.Integer Stream with skip
		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(x-> System.out.println(x) );
		System.out.println();
		//3.Integer Stream sum
		System.out.println(
		IntStream
		.range(1, 5)
		.sum());
		System.out.println();
		//4. Stream.Of ,sorted and findFirst
		
		Stream.of("Ritesh","Ranjan","Arya")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		
		// Stream of Array,filter ,sort 
		
		Stream.of("Ritesh","Arya","Rohan")
		.sorted()
		.filter(x -> x.startsWith("R"))
		.forEach(System.out::println);
		
		
		//Using Arrays.Stream ,sort ,filter
		String[] aray= {"arya","sonu","ritesh","ashu"};
		Arrays.stream(aray)
		.sorted()
		.filter(x -> x.startsWith("a") )
		.forEach(System.out::println);
		System.out.println();
		
		// Average of Square Of integer Arrays
		 Arrays.stream(new int[] {2,3,4,5,6})
		 .map(x-> x*x )
		 .average()
		 .ifPresent(System.out::println);
		 
		 // Or
		 
		 List<String> list=Arrays.asList("arya","sonu","mohan","ritesh","amar");
		 list
		 .stream()
		 .map(String::toLowerCase)
		 .filter(x -> x.startsWith("a") )
		 .forEach(System.out::println);
		 
		 // 8. Stream rows from text file ,sort ,filter and print .
		 Stream<String> band=Files.lines(Paths.get("C:\\Users\\Ritesh\\Documents\\zyz.text.txt")); 
		 
		 band                                 
           .sorted()
           .filter(x -> x.length() >5 )
           .forEach(System.out::println);
		 band.close();
		 
		 //9. Stream rows from text file and save to list 
		 
		 Stream<String> file=Files.lines(Paths.get("C:\\Users\\Ritesh\\Documents\\zyz.text.txt"));
		 
		 file
		 .sorted()
		 .filter(x -> x.contains("jh"))
		 .collect(Collectors.toList())
		 .forEach(System.out::println);
		 file.close();
		 
		 
		 // READ CSV(COMMA SEPERATED VALUE FILE ) AND THEN SPLIT THE VALUE SEPERATED BY COMMA AND CREATE ARRAY THEN PASS IT TO FILTER .
		 Stream<String> file2=Files.lines(Paths.get("C:\\Users\\Ritesh\\Documents\\zyz.text.txt"));
	       
		 int rowCount=(int)file2
		 .map(x -> x.split(","))
		 .filter(x -> x.length==3 )		 
		 .count();
		 System.out.println("No of row with 3 values are "+rowCount);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
