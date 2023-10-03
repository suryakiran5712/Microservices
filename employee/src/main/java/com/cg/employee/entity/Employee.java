package com.cg.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int employeeId;
	
	@Column(length = 30)
	private String employeeName;
	
	@Column
	private long employeeSalary;
	
	private int departmentId;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, long employeeSalary, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.departmentId = departmentId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
}
