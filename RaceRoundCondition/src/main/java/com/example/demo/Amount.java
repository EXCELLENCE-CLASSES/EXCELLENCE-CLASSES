package com.example.demo;

public class Amount {
	
	
	int  amount ;
	
	
	
	Amount(final int amount)
	{
		
	}
	public int getAmount()
	{
		return amount ;
	}
    public int changeAmount(int transferAmount) 
    {
    	this.amount=getAmount()+transferAmount;
    	
    	return amount;
    	
    }
    public int getBalanceAmount() 
    {
      int b=this.amount;
      System.out.println(b);
      
   	return b;
    }
    
}
