package com.example.demo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class DemoJavaProgramApplication {
	
	@Lazy
	@Bean("product1")
	public Product getBean() 
	{
		return new Product("DairyMilk");
		
	}
	@Bean("product2")
	public Product getBean2() 
	{
		return new Product("KitKat");
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DemoJavaProgramApplication.class, args);
		
		Product p1=ctx.getBean("product1",Product.class);
		p1.setDairyMilk("abc");
	/*
		String s1="WelecomeToExcellenceClasses";
		
		s1=s1.toLowerCase();
		
		System.out.println(s1.length());
		
		
		
		int len=s1.length();
		
		int index=0,n=(s1.length()/9),p=9;
		
		System.out.println(n);
		
		if(s1.length()%9!=0)
			System.out.println("Undivisible");
		
		String[] s2=new String[p];
		
		
		System.out.println("Equal Substrings Are");
		
		for(int i=0;i<len;i+=n) 
		{
			
			String subString=s1.substring(i, i+n);
			System.out.println(subString);
			
			s2[index]=subString ;
			System.out.println("index is "+index);
			
			index++;
			
		}
		
		System.out.println("Equal Substrings Are");
		for(int k=0;k<(s2.length);k++) 
		{
			System.out.println("N equal parts substring are");
			System.out.println(s2[k]);
			
		}
		
		System.out.println("subset of string are");
		
		String s="Wel";
		
		int temp=0;
	
		String[] s3=new String[ (s.length()*(s.length()+1))/2   ];
		
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i;j<s.length();j++) 
			{
				s3[temp]=s.substring(i,j+1);
				temp++;
				
				
			}
			
		}
		
		System.out.println("Subset of string listed here :-");
		for(int i=0;i<s3.length;i++) 
		{
			System.out.println(s3[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
}
