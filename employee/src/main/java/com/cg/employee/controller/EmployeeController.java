package com.cg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.Dto.EmployeeDto;
import com.cg.employee.entity.Employee;
import com.cg.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{employeeId}")
	public ResponseEntity<EmployeeDto> getDepartmentById(@PathVariable int employeeId)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
	}
}
