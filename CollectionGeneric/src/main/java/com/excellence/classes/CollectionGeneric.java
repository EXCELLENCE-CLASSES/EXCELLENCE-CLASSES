package com.excellence.classes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class Generic<T>
{
	T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}
	
	public void show()
	{
		System.out.println(i.getClass().getName());
		
	}
	
	
	
}

@SpringBootApplication
public class CollectionGeneric {

	public static void main(String[] args) {
		SpringApplication.run(CollectionGeneric.class, args);
		
		
		
		Generic<Integer> g1=new Generic<Integer>();
		g1.i=(int) 100.2;
		g1.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
