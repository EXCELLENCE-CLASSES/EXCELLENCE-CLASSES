package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class MySynchronizedMethod
{
	int count;
	public synchronized void increment() 
	{
		count++;
		
	}
	
	
	
}


@SpringBootApplication
public class MySynchronizedThreadApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MySynchronizedThreadApplication.class, args);
		MySynchronizedMethod m1=new MySynchronizedMethod();
		Runnable rn=() -> {
			// TODO Auto-generated method stub
			for(int i=1;i<=500;i++)
			{
				m1.increment();
				
				
			}
			
			
			
		};
		Thread t1=new Thread(rn);
		
		// t1.join();
		Runnable rn2=() -> {
				// TODO Auto-generated method stub
				for(int i=1;i<=500;i++)
				{
					m1.increment();
					
					
				}
		};
				
				
				
			
			// Thread t1=new Thread(rn);
		
		Thread t2=new Thread(rn2);
	 t1.start();
		
		t2.start();
	
		// t1.join();
		// t2.join();
		
		// MySynchronizedMethod m1=new MySynchronizedMethod();
		// System.out.println(m1.count);
	//	MySynchronizedMethod m1=new MySynchronizedMethod();
	//	System.out.println(m1.getCount());
		System.out.println(m1.count);
		
		
		
	

		}}
