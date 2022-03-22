package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="exc_registration_detail")
public class ExcellenceRegistrationDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="branch_Id")
	int excRegistrationId ;
	
	@Column(name="reg_date")
	Date stuRegDate ;
	
	@Column(name="branch_id")
	Long branchId ;
	
	
	
	
	
	

}
