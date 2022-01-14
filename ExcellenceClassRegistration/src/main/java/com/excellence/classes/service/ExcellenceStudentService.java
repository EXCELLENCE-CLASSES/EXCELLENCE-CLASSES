package com.excellence.classes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.excellence.classes.StudentDetails;
import com.excellence.classes.StudentRepository;
import com.excellence.classes.student.ExcellenceStudent;

@Service
public class ExcellenceStudentService implements UserDetailsService {
	
	@Autowired
	private StudentRepository str;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		ExcellenceStudent exc=str.findByStudentName(username);
		if(exc==null)
			throw new UsernameNotFoundException("Authentication not provided to user (404 error) ");
		return new StudentDetails(exc);
	}

}
