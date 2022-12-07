package com.springboot.practice.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.springboot.practice.Entity.Departments;
import com.springboot.practice.Repository.DepartmentsDao;
import com.springboot.practice.Service.DepartmentsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



@CrossOrigin(origins= "http://localhost:4200")
@RestController

public class DepartmentsController {
	@Autowired	
	DepartmentsService departmentservice;

	@GetMapping("/departments")
    public ResponseEntity<?> viewDepartments(){
	List<Departments> list=departmentservice.viewDepartments();
	return ResponseEntity.ok(list);
	}
	
	@GetMapping("/departments/{departmentCode}")
	public ResponseEntity<?> viewDepartment(@PathVariable String departmentCode) {
		Departments department=departmentservice.viewDepartment(departmentCode); 
		return ResponseEntity.ok(department);
	}
	
	@PostMapping("/departments")
	public ResponseEntity<?> addDepartment(@RequestBody Departments department){
		return departmentservice.addDepartment(department);
	}
	
	@PutMapping("/departments/{departmentCode}")
	public ResponseEntity<?> modifyDepartment( @PathVariable String departmentCode, @RequestBody Departments department){
		return departmentservice.modifyDepartment(departmentCode, department);
	}
	
	@DeleteMapping("/departments/{departmentCode}")
	public ResponseEntity<?> removeDepartments(@PathVariable String departmentCode){
       return departmentservice.removeDepartments(departmentCode);
	}
}
