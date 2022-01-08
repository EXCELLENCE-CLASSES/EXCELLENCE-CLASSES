package com.excellence.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.excellence.classes.comparable.MyComparable;

@SpringBootApplication
public class ExcellenceClassesProject9Application {

	public static void main(String[] args) {
		SpringApplication.run(ExcellenceClassesProject9Application.class, args);
		
		MyComparable mc=new MyComparable("Muskan",100);
		MyComparable mc2=new MyComparable("Gyanada",200);
		MyComparable mc3=new MyComparable("Ankit",300);
           ArrayList<MyComparable> al1=new ArrayList<>();
           al1.add(mc);
           al1.add(mc2);
           al1.add(mc3);
           Collections.sort(al1);
           Iterator itr=al1.iterator();
           while(itr.hasNext()) {
        	   MyComparable m1=(MyComparable)itr.next();
        	   System.out.println("Student Id Is "+m1.excellenceId+" and Name is "+m1.name);
           }
           System.out.println("ForEach loop executing here");
            for(MyComparable m1:al1) {
            	System.out.println("Excellence Id is " +m1.excellenceId +" name is " + m1.name);
            }           
           
           
           
           
           
           

	}

}
