package com.springboot.practice.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.practice.Entity.Departments;
import com.springboot.practice.Exception.DepartmentNotFoundException;
import com.springboot.practice.Exception.RecordAlreadyPresentException;
import com.springboot.practice.Repository.DepartmentsDao;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

@Autowired	
DepartmentsDao departmentsDao;

// list of all dept
public List<Departments> viewDepartments(){
return departmentsDao.findAll();
}
 //dept details of the mentioned dept code
	public Departments viewDepartment(String departmentCode) {
	
		Departments departments= departmentsDao.findById(departmentCode).orElse(null);
		if(Objects.isNull(departments))
			throw new DepartmentNotFoundException("Department with department code"+departmentCode+"is not exist");
			
		else {
			return departments;
		}
	}
	
	
	// add dept
	public ResponseEntity<?> addDepartment(Departments department){
		if(Objects.nonNull(departmentsDao.findById(department.getDepartmentCode()).orElse(null)))
			throw new RecordAlreadyPresentException("The department with department code "+department.getDepartmentCode()+" already exists");
		else
		{
			departmentsDao.save(department);
			return new ResponseEntity<Departments>(department,HttpStatus.CREATED);
		}
	}
	
	
	// update details of dept
	public ResponseEntity<?> modifyDepartment( String departmentCode, Departments department){
		Departments departmentdb= departmentsDao.findById(department.getDepartmentCode()).orElse(null);
			if(Objects.isNull(departmentdb))
			throw new DepartmentNotFoundException("The department with department code "+department.getDepartmentCode()+" is not  exists");
		else
		{
			if(Objects.nonNull(department.getDepartmentName()))
				departmentdb.setDepartmentName(department.getDepartmentName());
		}
		departmentsDao.save(departmentdb);
		return ResponseEntity.ok("Department with department code  "+departmentCode+"  has been modified");
	}
	
	
	// delete dept
	public ResponseEntity<?> removeDepartments(String departmentCode){
		Departments departments= departmentsDao.findById(departmentCode).orElse(null);
		if(Objects.isNull(departments))
			throw new DepartmentNotFoundException("Department with department code"+departmentCode+"is not exist");
			
		else {
			departmentsDao.deleteById(departmentCode);
			return ResponseEntity.ok("Department with department code"+departmentCode+"has been deleted");
		}
		}
	}

