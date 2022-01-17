package com.excellence.classes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

class Num
{
	int q;
	
	boolean valueSet=false;

	public synchronized void  getQ() {
		while(!valueSet)
		{
			try {
				wait();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println("Get "+q);
		
		valueSet=false;
		notify();
		
		
		
		
		
	}

	public synchronized void setQ(int q) {
		while(valueSet) 
		{
			try {
				wait();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		this.q = q;
		System.out.println("Set "+q);
		valueSet=true;
		notify();
	}
	
	
}
class Producer implements Runnable
{
       Num n1;
       


	public Producer(Num n1) {
		super();
		this.n1 = n1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true)
			{
			n1.setQ(i++);
			try {
			Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println("Exception Occured");
			}
			}
		
		
	}
	
}
class Consumer implements Runnable
{
	Num n1;
	
	

	public Consumer(Num n1) {
		super();
		this.n1 = n1;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) 
		{
			n1.getQ();
			try {
				Thread.sleep(5000);
				}
				catch(Exception e) {
					System.out.println("Exception Occured");
				}
		}
		
	}
	
}

@SpringBootApplication
public class ConsumerProducerThreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerProducerThreadApplication.class, args);
		Num n1=new Num();
		Producer p1=new Producer(n1);
		Consumer c1=new Consumer(n1);
		Thread t1=new Thread(p1);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}

}
