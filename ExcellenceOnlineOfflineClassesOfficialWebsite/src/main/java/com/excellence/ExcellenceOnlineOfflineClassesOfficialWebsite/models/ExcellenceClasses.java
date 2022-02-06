package com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="excellence")
public class ExcellenceClasses {
	
	
	@Id
	@GeneratedValue
	@Column(name="branchId")
	private int branchId ;
	
	@Column(name="address")
	private String address ;
	
	@Column(name="classType")
	private String classType ;
	
	@OneToMany(targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinColumn(name="exc_foreign_key",referencedColumnName="branchId")
	private List<Student> studentInfo ;

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

	public List<Student> getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(List<Student> studentInfo) {
		this.studentInfo = studentInfo;
	}

	@Override
	public String toString() {
		return "ExcellenceClasses [branchId=" + branchId + ", address=" + address + ", classType=" + classType
				+ ", studentInfo=" + studentInfo + "]";
	}
	
	
	
	

	
	
	

}
