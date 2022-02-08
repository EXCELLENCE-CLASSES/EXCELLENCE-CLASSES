package com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="excellence")
public class ExcellenceClasses {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	@Column(name="branchId")
	private int branchId ;
	
	@Column(name="address")
	private String address ;
	
	@Column(name="classType")
	private String classType ;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fr_key",referencedColumnName="branchId" )
	private List<Student> student;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	@Override
	public String toString() {
		return "ExcellenceClasses [branchId=" + branchId + ", address=" + address + ", classType=" + classType + "]";
	}

	
	
	
	

	
	
	

}
