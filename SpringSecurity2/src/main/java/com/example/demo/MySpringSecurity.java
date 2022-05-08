package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class MySpringSecurity extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		auth.inMemoryAuthentication().withUser("exc").password("arya").roles("USER");
		
		
		
		
		
		
	}
		
	@Bean
	public PasswordEncoder getPasswordEncorder() 
	{
		return NoOpPasswordEncoder.getInstance();
		
	}
	
	
	
	
	
	
	

}
