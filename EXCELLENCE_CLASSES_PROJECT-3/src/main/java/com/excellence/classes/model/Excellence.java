package com.excellence.classes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Excellence 
{
	
	
	
	@Id
	private int excellenceId ;
	private String branch ;
	private String courses;
	
	
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getExcellenceId() {
		return excellenceId;
	}
	public void setExcellenceId(int excellenceId) {
		this.excellenceId = excellenceId;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Excellence [excellenceId=" + excellenceId + ", branch=" + branch + ", courses=" + courses + "]";
	}
	
	
	
	
	
	
	

}
