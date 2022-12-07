package com.springboot.practice.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springboot.practice.Entity.Departments;

public interface DepartmentsService {

	
    public List<Departments> viewDepartments();
	
	public Departments viewDepartment(String departmentCode);
	
	public ResponseEntity<?> addDepartment(Departments department);
	
	public ResponseEntity<?> modifyDepartment( String departmentCode, Departments department);
	
	public ResponseEntity<?> removeDepartments(String departmentCode);
}
