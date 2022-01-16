package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class MyThread1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) 
		{
			System.out.println("My First Thread Running");
			try
			{ Thread.sleep(1000); }
			catch(Exception e) 
			{
				System.out.println("Exception Occured");
			}
			
			
		}
		
	}
	
}
class MyThread2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) 
		{
			System.out.println("My Second Thread Running");
			try
			{ Thread.sleep(1000); }
			catch(Exception e) 
			{
				System.out.println("Exception Occured");
			}
			
		}
		
	}
	
}
@SpringBootApplication
public class StartThread1Application {

	public static void main(String[] args) {
		SpringApplication.run(StartThread1Application.class, args);
		Runnable m1=new MyThread1();
		// m1.run();
		Runnable m2=new MyThread2();
	//	m2.run();
		Thread t1=new Thread(m1);
		t1.start();
		try {
		Thread.sleep(500);
		}
		catch(Exception e) 
		{
			System.out.println("Exception Occured");
		}
		
		Thread t2=new Thread(m2);
		t2.start();
		
	}

}
