package com.excellence.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionPracticeApplication.class, args);
		Collection d1=new ArrayList<>();
		d1.add(35);
		d1.add(95);
		d1.add(99);
		d1.add(55);
		System.out.println(d1);
		
		Collection<Integer> c1=new ArrayList<>();
		c1.add(90);
		c1.add(20);
		c1.add(35);
		c1.add(95);
		c1.add(35);
		System.out.println(c1);
		
		//Set s1=new HashSet();
		//s1.add(s1)
		List l1=new ArrayList();
		l1.add(25);
		l1.add(5);
		l1.add(90);
		l1.add(25);
		System.out.println(l1);
		List<String> l2=new ArrayList<>();
		l2.add("arya");
		l2.add("Ritesh");
		l2.add("Ranjan");
		
		Set s1=new HashSet();
		s1.add(98);
		s1.add(55);
		s1.add(98);
		s1.add(75);
		System.out.println("Value Of HashSet Is "+s1);
		
		Set<Integer> s2=new HashSet<>();
		s2.add(25);
		s2.add(85);
		s2.add(85);
		System.out.println("value of generic Hash Set Is"+ s2);
		
		Set s3=new TreeSet();
		s3.add(20);
		s3.add(95);
		s3.add(79);
		System.out.println("Value Of Tree Set Is "+s3);
		
		Set<String> s5=new TreeSet<>();
		s5.add("Ritesh");
		s5.add("Ranjan");
		s5.add("arya");
		System.out.println("Value Of Generic TreeSet iS "+s5);
		
		Set<Integer> s6=new TreeSet<>();
		s6.add(100);
		s6.add(85);
		s6.add(85);
		System.out.println("Value Of Integer Generic Set Is "+s6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
