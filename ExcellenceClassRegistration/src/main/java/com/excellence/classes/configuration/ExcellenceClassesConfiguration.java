package com.excellence.classes.configuration;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class ExcellenceClassesConfiguration extends WebSecurityConfigurerAdapter
{
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider studentAuthentication() 
	{
		DaoAuthenticationProvider studentAuthneticate=new DaoAuthenticationProvider();
		
		studentAuthneticate.setUserDetailsService(userDetailsService);
		
		studentAuthneticate.setPasswordEncoder(NoOpPasswordEncoder.getInstance() );
		
		
		return studentAuthneticate ;
		
		
		
	}
	
	
	
	
	
   // @Bean
   //	@Override
	// protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
    	// List<UserDetails> student=new ArrayList<>();
    	
    	// student.add(User.withDefaultPasswordEncoder().username("Ritesh Ranjan Arya").password("excellence").roles("USER").build() );
    	// return new InMemoryUserDetailsManager(student);
    	
    	
			}
	
	


