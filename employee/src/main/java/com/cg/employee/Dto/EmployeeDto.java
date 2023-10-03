package com.cg.employee.Dto;

import com.cg.employee.responseVO.Department;

public class EmployeeDto {

	private int employeeId;
	
	private String employeeName;

	private long employeeSalary;
	
	private Department department;

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public EmployeeDto(int employeeId, String employeeName, long employeeSalary, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
}
