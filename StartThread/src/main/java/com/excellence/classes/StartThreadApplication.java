package com.excellence.classes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=3;i++) 
		{
			System.out.println("My First Thread Exceuting");
			try 
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
			}
		}
		
	}
	
}
class MyThread2 extends Thread
{
	public void run() 
	{
		for(int i=0;i<=3;i++) 
		{
			System.out.println("My Second Thread Exceuting");
			try 
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured");
			}
		}
		
		
	}
	
}

@SpringBootApplication
public class StartThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartThreadApplication.class, args);
		
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		// m1.thread1();
		// m2.thread2();
		m1.start();
		try 
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
		m2.start();
		
	}

}
