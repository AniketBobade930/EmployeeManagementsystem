package com.spring.empapi.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.empapi.entity.Employee;
import com.spring.empapi.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

  
    public Employee getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null); // Return null if employee not found
    }

    // Update an employee by ID
    public Employee updateEmployeeById(int id, Employee updatedEmployee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);

        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setSal(updatedEmployee.getSal());
            
            return employeeRepository.save(existingEmployee); // Save the updated employee
        } else {
            return null; // Employee not found
        }
    }


    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }
}
