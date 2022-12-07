package com.springboot.practice.Exception;

public class DepartmentNotFoundException extends RuntimeException {
	public DepartmentNotFoundException()
	{
		
	}
	public DepartmentNotFoundException(String message)
	{
		super(message);
	}
	
}
