package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="exc_stu_model")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcellenceStudentModel {
	
	@Id
	@GeneratedValue
	private int excellenceStudentId ;
	
	
	private String excellenceStudentName ;

}
