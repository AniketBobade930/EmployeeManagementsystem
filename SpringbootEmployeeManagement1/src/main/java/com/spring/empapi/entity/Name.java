package com.spring.empapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Name {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int nameId;
	
private String empName;

private String empCourse;

public int getEmpId() {
	return nameId;
}

public void setEmpId(int empId) {
	this.nameId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpCourse() {
	return empCourse;
}

public void setEmpCourse(String empCourse) {
	this.empCourse = empCourse;
}



}
