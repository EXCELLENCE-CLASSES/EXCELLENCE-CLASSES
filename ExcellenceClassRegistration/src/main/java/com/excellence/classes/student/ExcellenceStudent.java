package com.excellence.classes.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "excellencestudent")
public class ExcellenceStudent {
	
	
	@Id
	@Column(name="studentid")
	private int studentId ;
	@Column(name="studentname")
	private String studentName ;
	@Column(name="course")
	private String course;
	@Column(name="studentclass")
	private String studentClass;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "ExcellenceStudent [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course
				+ ", studentClass=" + studentClass + "]";
	}
	
	
	
	
	

}
