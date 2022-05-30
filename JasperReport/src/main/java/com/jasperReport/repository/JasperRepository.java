package com.jasperReport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasperReport.model.Employee;

public interface JasperRepository extends JpaRepository<Employee,Integer> {

}
