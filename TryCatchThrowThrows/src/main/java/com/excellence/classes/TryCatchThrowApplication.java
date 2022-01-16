package com.excellence.classes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class Try
{
	int a=5;
	int b=0;
	final int  c ;
	
	
	 public Try(int c) {
		super();
	this.c = c;
	}


	void divide()  throws ArithmeticException 
	{
	 System.out.println("executing");
	
	   
		
		
		if(b==0) {
			
		
		throw new ArithmeticException();
		}
		
		
		
		else 
		
		
		System.out.println(a/b);
		
		
		}
	
	
}

@SpringBootApplication
public class TryCatchThrowApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryCatchThrowApplication.class, args);
		Try t3=new Try(20);
		System.out.println("before"+t3);
		t3=null;
		System.gc();
		System.out.println("current value of t2 is"+t3);
		
		System.out.println(t3);
		
		Try t1=new Try(10);
	try {
		t1.divide();
		}
	 catch(ArithmeticException e) 
 {
		System.out.println("Zero Division Exception Occured ,please provide divisor other then zero");
			
		}
	 finally 
	 {
		 System.out.println("always executing ");
	 }
		Try t2=new Try(20);
		System.out.println("before"+t2);
		t2=null;
		System.out.println("Garbage Created");
		
		System.out.println("Garbage Collection Done");
		
		System.out.println("current value of t2 is"+t2);
		
		System.out.println(t2);
		System.gc();
		 
        
		
	}
			
		
		
		
		
		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("KKKKKKKKKKKKKKKKKKKhello");
			
		}


}

