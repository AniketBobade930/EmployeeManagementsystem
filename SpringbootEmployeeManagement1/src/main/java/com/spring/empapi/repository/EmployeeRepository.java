package com.spring.empapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.empapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
