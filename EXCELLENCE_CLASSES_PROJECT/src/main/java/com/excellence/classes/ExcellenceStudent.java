package com.excellence.classes;

import java.sql.Date;

public class ExcellenceStudent {
	private String name ;
	private String excellence_Id ;
	private String branch ;
	private Date date_Of_Birth ;
	private String gender ;
	private String address ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExcellence_Id() {
		return excellence_Id;
	}
	public void setExcellence_Id(String excellence_Id) {
		this.excellence_Id = excellence_Id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}
	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ExcellenceStudent [name=" + name + ", excellence_Id=" + excellence_Id + ", branch=" + branch
				+ ", date_Of_Birth=" + date_Of_Birth + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	

}
