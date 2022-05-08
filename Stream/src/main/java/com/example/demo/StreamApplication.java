package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class Employee
{
	String name;
	int sal;
	
	public Employee(String name, int sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}

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
		
		//Sum using method reference 
		int sum5=Arrays.stream(integ).reduce(Integer::sum).get();
		System.out.println(sum5);
		//Sum of Salary of 5 employees using Stream->filter->map->reduce
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee("Ritesh",500));
		list.add(new Employee("Ranjan",600));
		list.add(new Employee("Ranjan",800));
		
	int sal=	list.stream().filter(e -> e.getSal()>500).map(e -> e.getSal()).reduce(0,(num1,num2) -> num1+num2);
		
	System.out.println("Sum Of Salary Of Employees ,whose salary is greate then 500 is "+sal);	
	
	//2nd highest salary
	int seconddHigestSalary=list.stream().map(e -> e.getSal()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	
	System.out.println("Second Highest Salary Of Employee Is "+seconddHigestSalary);
	
    //Salary of Employee
	List<Integer> i1=list.stream().map(e -> e.getSal()).collect(Collectors.toList());
	System.out.println("List is"+i1);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
