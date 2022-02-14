package com.excellence.OnlineOfficialWebsite.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="excellence")
public class ExcellenceClassesDetails {
	

	@Id 
	@Column(name="branchId")
   private int branchId;
    
	@Column(name="branchName")
	private String branchName;
	@Column(name="branchAddress")
	private String branchAddress;
	@Column(name="branchCourses")
	private String branchCourses;
	@Column(name="numberOfStudent")
	private String numberOfStudent ;
    
    //optional=false(Defined For @ManyToOne but not for @OneToMany)annotation helps to achieve lazy loading.
    //The FetchType. LAZY tells Hibernate to only fetch the related entities from the database when you use the relationship. This is a good idea in general because there's no reason to select entities you don't need for your uses case.
    @OneToMany(targetEntity=ExcellenceTeacherDetails.class ,cascade=CascadeType.ALL)
    @JoinColumn(name="fr_tch_key",referencedColumnName="branchId" )
    private List<ExcellenceTeacherDetails> excTeacherDetails;
    
 @OneToMany(targetEntity=ExcellenceStudentDetails.class ,cascade=CascadeType.ALL )
 @JoinColumn(name="fr_st_ky",referencedColumnName="branchId")
 private List<ExcellenceStudentDetails> excStudentDetails;

public int getBranchId() {
	return branchId;
}

public void setBranchId(int branchId) {
	this.branchId = branchId;
}

public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

public String getBranchAddress() {
	return branchAddress;
}

public void setBranchAddress(String branchAddress) {
	this.branchAddress = branchAddress;
}

public String getBranchCourses() {
	return branchCourses;
}

public void setBranchCourses(String branchCourses) {
	this.branchCourses = branchCourses;
}

public String getNumberOfStudent() {
	return numberOfStudent;
}

public void setNumberOfStudent(String numberOfStudent) {
	this.numberOfStudent = numberOfStudent;
}

public List<ExcellenceTeacherDetails> getExcTeacherDetails() {
	return excTeacherDetails;
}

public void setExcTeacherDetails(List<ExcellenceTeacherDetails> excTeacherDetails) {
	this.excTeacherDetails = excTeacherDetails;
}

public List<ExcellenceStudentDetails> getExcStudentDetails() {
	return excStudentDetails;
}

public void setExcStudentDetails(List<ExcellenceStudentDetails> excStudentDetails) {
	this.excStudentDetails = excStudentDetails;
}

@Override
public String toString() {
	return "ExcellenceClassesDetails [branchId=" + branchId + ", branchName=" + branchName + ", branchAddress="
			+ branchAddress + ", branchCourses=" + branchCourses + ", numberOfStudent=" + numberOfStudent
			+ ", excTeacherDetails=" + excTeacherDetails + ", excStudentDetails=" + excStudentDetails + "]";
}
 
 
      

	

	
    
    
	
	
	
	

}
