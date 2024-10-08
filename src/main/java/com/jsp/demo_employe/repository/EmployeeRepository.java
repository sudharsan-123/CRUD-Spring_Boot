package com.jsp.demo_employe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.demo_employe.dto.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
