package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;




@Data
@Entity
@Table(name="exc_stu_detail")
public class ExcellenceStudentDetail {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int excStudentId ;
	
	
	 private String excStudentName ;
	
	
	private String excStudentAddress ;
	
	
	private String studentDOB ;
	
	
	
	
	

}
