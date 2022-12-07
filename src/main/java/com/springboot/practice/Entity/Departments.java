package com.springboot.practice.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Departments {


@Column(name="department_No")
private int departmentNo;
@Id
@Column(name="department_Code")
private String departmentCode;
@Column(name="department_Name")
private String departmentName;

@OneToMany( targetEntity=Semester.class, cascade= CascadeType.ALL)
@JoinColumn(name="deptarment_Code", referencedColumnName = "department_Code")
private List<Semester> semesterList= new ArrayList<Semester>();

@OneToMany( targetEntity=Subjects.class, cascade= CascadeType.ALL)
@JoinColumn(name="deptarment_Code", referencedColumnName = "department_Code")
private List<Subjects> subjectList= new ArrayList<Subjects>();

public int getDepartmentNo() {
	return departmentNo;
}

public void setDepartmentNo(int departmentNo) {
	this.departmentNo = departmentNo;
}

public String getDepartmentCode() {
	return departmentCode;
}

public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public List<Semester> getSemesterList() {
	return semesterList;
}

public void setSemesterList(List<Semester> semesterList) {
	this.semesterList = semesterList;
	
	
	
	
}

public List<Subjects> getSubjectList() {
	return subjectList;
}

public void setSubjectList(List<Subjects> subjectList) {
	this.subjectList = subjectList;
}










}
