package com.excellence.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class ThreaddByLembdaExcpressionApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ThreaddByLembdaExcpressionApplication.class, args);
		Runnable rn1=() -> {
				// TODO Auto-generated method stub
				for(int i=0;i<=3;i++)
				{
					System.out.println("My First Thread1 Executing");
					try 
					{ Thread.sleep(500); }
					catch(Exception e)
					{
						System.out.println("Exception Ocurred");
						
					}
					
				}
				
			
			
		};
		Runnable rn2=() -> {
				// TODO Auto-generated method stub
				for(int i=0;i<=3;i++)
				{
					System.out.println("My Second Thread2 Executing");
					try 
					{ Thread.sleep(500); }
					catch(Exception e)
					{
						System.out.println("Exception Ocurred");
						
					}
					
				}
				
			
			
		};
		Thread t1=new Thread(rn1);
		try { Thread.sleep(500);}
		catch(Exception e)
		{
			System.out.println("Excepetion Occurred");
		}
		Thread t2=new Thread(rn2);
		t1.start();
		Thread.sleep(10);
		t2.start();
		 System.out.println("Now we are ready to join two thread after that main thread will be executed");
		System.out.println(t1.isAlive());
		 t1.join();
		 System.out.println("here "+t1.isAlive());
		 System.out.println("here "+t2.isAlive());
		t2.join();
		System.out.println(t1.isAlive());
		 System.out.println("here "+t2.isAlive());
		
		 
		
		 
		
		
	}

}
