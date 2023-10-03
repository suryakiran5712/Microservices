package com.cg.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.employee.Dto.EmployeeDto;
import com.cg.employee.entity.Employee;
import com.cg.employee.repository.EmployeeRepository;
import com.cg.employee.responseVO.Department;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public EmployeeDto getEmployeeById(int employeeId)
	{
		Employee emp = employeeRepository.findById(employeeId).orElse(null);
		Department dep = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+emp.getDepartmentId() , Department.class);
		
		EmployeeDto empDto = new EmployeeDto(employeeId,emp.getEmployeeName(),emp.getEmployeeSalary(),dep);
		return empDto;
	}
}
