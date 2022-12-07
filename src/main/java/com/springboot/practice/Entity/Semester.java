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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Semester {

@Column(name="semester_No")
private int semesterNo;
@Id
@Column(name="semester_Code")
private String semesterCode;


@OneToMany( targetEntity= Subjects.class, cascade= CascadeType.ALL)
@JoinColumn(name="semester_Code", referencedColumnName = "semester_Code")
private List<Subjects> subjectList= new ArrayList<Subjects>();


public int getSemesterNo() {
	return semesterNo;
}


public void setSemesterNo(int semesterNo) {
	this.semesterNo = semesterNo;
}


public String getSemesterCode() {
	return semesterCode;
}


public void setSemesterCode(String semesterCode) {
	this.semesterCode = semesterCode;
}


public List<Subjects> getSubjectList() {
	return subjectList;
}


public void setSubjectList(List<Subjects> subjectList) {
	this.subjectList = subjectList;
}










}
