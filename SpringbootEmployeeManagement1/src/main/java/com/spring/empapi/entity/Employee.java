package com.spring.empapi.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
//
@OneToOne(cascade = CascadeType.ALL)
private Name name;

private double sal;


public Employee() {
	super();

}

public Employee(int id, Name name, double sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Name getName() {
	return name;
}

public void setName(Name name) {
	this.name = name;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}

}
