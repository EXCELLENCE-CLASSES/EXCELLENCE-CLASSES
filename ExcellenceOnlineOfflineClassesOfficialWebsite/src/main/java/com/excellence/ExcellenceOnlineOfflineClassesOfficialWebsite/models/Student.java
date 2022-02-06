package com.excellence.ExcellenceOnlineOfflineClassesOfficialWebsite.models;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="studentId")	
	int studentId ;
	
	@Column(name="studentName")
	private String studentName ;
	
	@Column(name="studentAddress")
	private String studentAddress;
	
	@Column(name="studentAge")
	private String studentAge;
	
	@Column(name="excellenceId")
	private int excellenceId ;
	
	//@ManyToOne
	//@JoinColumn(name="excellenceId" ,insertable=false, updatable=false)
	private ExcellenceClasses excellence;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public int getExcellenceId() {
		return excellenceId;
	}

	public void setExcellenceId(int excellenceId) {
		this.excellenceId = excellenceId;
	}

	public ExcellenceClasses getExcellence() {
		return excellence;
	}

	public void setExcellence(ExcellenceClasses excellence) {
		this.excellence = excellence;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentAge=" + studentAge + ", excellenceId=" + excellenceId + ", excellence=" + excellence + "]";
	}
	
	
	
	
	

}
