package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class ATM 
{
	int amount;
	ATM(int amount)
	{
		this.amount=amount;
	}
	public void depositeMoney(int depositedAmount)
	{
		amount+=depositedAmount;
		System.out.println("Transaction Successful,Current Balance = "+amount);
		
		
	}
	public void withdrawMoney(int withdrwalAmount) 
	{
		amount-=withdrwalAmount;
		System.out.println("Amount withdrawl successfully "+withdrwalAmount);
		System.out.println("Current Balance is "+amount);
	
		
	}
	public void checkBalance() 
	{
		System.out.println("Current Balance is "+amount);
		
	}
	
}

@SpringBootApplication
public class AtMprogrammeApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(AtMprogrammeApplication.class, args);
		ATM a1=new ATM(50000);
		Scanner scn=new Scanner(System.in);
		System.out.println("Input number to be selected");
		int num=scn.nextInt();
		String text;
		
		
		switch(num)
		{
		case 1:  System.out.println("Input amount need to be deposited");
		         int depAmt=scn.nextInt();
			     a1.depositeMoney(depAmt);
			     break;
			
		case 2: System.out.println("Input amount need to be withdrawl");
		        int withdrawlAmount=scn.nextInt();
			     a1.withdrawMoney(withdrawlAmount);
		         break;
			
		case 3:  a1.checkBalance();
			     break;
			
			default: System.out.println("Exit");
				     System.exit(0);
		}
		
		
		
	}

}
