package com.excellence.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excellence.classes.comparator.Excellenc;
import com.excellence.classes.comparator.MyComparator;
import com.excellence.classes.comparator.MySecondComparator;

@SpringBootApplication
public class ExcellenceClassesProject8Application {

	public static void main(String[] args) {
		SpringApplication.run(ExcellenceClassesProject8Application.class, args);
		
		Excellenc e1=new Excellenc(20,"Muskan","Deoli");
		Excellenc e2=new Excellenc(30,"Gyanada","Kahnpur");
		MyComparator m1=new MyComparator();
				
		ArrayList<Excellenc> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		Collections.sort(al,m1);
		Iterator i1=al.iterator();
		while(i1.hasNext()) 
		{
			Excellenc e5=((Excellenc)(i1.next()));
			System.out.println("Student Id is "+e5.id+" name is "+e5.name+" branch is "+e5.branch);
		}
		MySecondComparator sc=new MySecondComparator();
		
		ArrayList<Excellenc> al2=new ArrayList<>();
		al2.add(e1);
		al2.add(e2);
		Collections.sort(al2, sc);
		Iterator it=al2.iterator();
		while(it.hasNext()) 
		{
			Excellenc e5=((Excellenc)(it.next()));
			System.out.println("Student Id is"+e5.id+" name is "+e5.name+" branch is "+e5.branch);
		}
		
		
	}

}
