package com.excellence.classes;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.excellence.classes.student.ExcellenceStudent;

public class StudentDetails implements UserDetails {
	
	
	private ExcellenceStudent exc;
	
	

	public StudentDetails(ExcellenceStudent exc) {
		super();
		this.exc = exc;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER") );
		
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return exc.getCourse();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return exc.getStudentName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
