package com.excellence.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionAndListApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionAndListApplication.class, args);
		
		Collection c1=new ArrayList();
		c1.add(65);
		c1.add(90);
		c1.add(95);
		c1.add(90);
		System.out.println(c1);
		
		System.out.println(c1);
		List<String> L1=new ArrayList<>();
		L1.add("arya");
		L1.add("sonu");
		System.out.println(L1);
		Set  s5=new LinkedHashSet<>();
		s5.add(56);
		s5.add(54);
		s5.add("arya");
		s5.add(23);
		s5.add(96);
		s5.add("ritesh");
		System.out.println(s5);
		Set s10=new HashSet<>();
		s10.add(15);
		s10.add(5);
		s10.add(2);
		System.out.println(s10);
		
		
		
		
		
		
	}

}
