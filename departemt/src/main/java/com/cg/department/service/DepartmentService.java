package com.cg.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.department.entity.Department;
import com.cg.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department addDepartment(Department department)
	{
		return departmentRepository.save(department);
	}
	
	public List<Department> getAllDepartments()
	{
		return departmentRepository.findAll();
	}
	
	public Department getDepartmentById(int departmentId)
	{
		return departmentRepository.findById(departmentId).orElse(null);
		
	}
		
	public String deleteDepartmentById(int departmentId)
	{
		if(departmentRepository.existsById(departmentId))
		{
			departmentRepository.deleteById(departmentId);
			return "Department with Id = " + departmentId +" deleted successfully";
		}
		return "Department with Id = " + departmentId +" not found";
	}
}
