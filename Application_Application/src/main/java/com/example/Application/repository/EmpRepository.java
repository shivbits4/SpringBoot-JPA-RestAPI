package com.example.Application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Application.model.Employee;


public interface EmpRepository extends JpaRepository<Employee, Long> {
	
	
	List<Employee> findByOccupation(String occu);
	

}
