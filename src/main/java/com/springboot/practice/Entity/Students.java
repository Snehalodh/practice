package com.springboot.practice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
@Entity
public class Students {


@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name="student_Id")
private int studentId;

@Column(name="student_No")
private int studentNo;
@Column(name="student_Name")
private String studentName;

@OneToOne(targetEntity=Departments.class, cascade= CascadeType.ALL)
@JoinColumn(name="department_Code", referencedColumnName="department_Code")
private Departments departments;

@OneToOne(targetEntity=Semester.class, cascade= CascadeType.ALL)
@JoinColumn(name="semester_Code", referencedColumnName="semester_Code")
private Semester semester;

public int getStudentNo() {
	return studentNo;
}

public void setStudentNo(int studentNo) {
	this.studentNo = studentNo;
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public Departments getDepartments() {
	return departments;
}

public void setDepartments(Departments departments) {
	this.departments = departments;
}

public Semester getSemester() {
	return semester;
}

public void setSemester(Semester semester) {
	this.semester = semester;
}




}
