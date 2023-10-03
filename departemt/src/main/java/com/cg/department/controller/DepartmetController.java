package com.cg.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.department.entity.Department;
import com.cg.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmetController {
	
	@Autowired
	DepartmentService departmetService;
	
	@PostMapping("/")
	public ResponseEntity<Department> addDeparment(@RequestBody Department department)
	{
		return new ResponseEntity<Department>(departmetService.addDepartment(department),HttpStatus.CREATED);
	}

	@GetMapping("/")
	public ResponseEntity<List<Department>> getAllDepartments()
	{
		return new ResponseEntity<List<Department>>( departmetService.getAllDepartments(),HttpStatus.OK);
	}
	
	@GetMapping("/{departmentId}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable int departmentId)
	{
		return new ResponseEntity<Department>(departmetService.getDepartmentById(departmentId),HttpStatus.OK);
	}
	
	@DeleteMapping("/{departmentId}")
	public String deleteDepartmentById(@PathVariable int departmentId)
	{
		return departmetService.deleteDepartmentById(departmentId);
	}
}
