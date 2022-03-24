package com.example.demo;

public class Product {
	
	
	String dairyMilk ;

	public Product(String dairyMilk) {
		super();
		this.dairyMilk = dairyMilk;
		System.out.println("I Got "+dairyMilk);
	}

	public String getDairyMilk() {
		return dairyMilk;
	}

	public void setDairyMilk(String dairyMilk) {
		this.dairyMilk = dairyMilk;
	}
	
	
	
	

}
