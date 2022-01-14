package com.excellence.classes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.classes.student.ExcellenceStudent;

public interface StudentRepository extends JpaRepository<ExcellenceStudent, Integer> {
	
	
	ExcellenceStudent findByStudentName(String studentName);

}
