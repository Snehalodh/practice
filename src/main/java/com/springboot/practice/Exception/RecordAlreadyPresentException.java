package com.springboot.practice.Exception;

public class RecordAlreadyPresentException extends RuntimeException{
public RecordAlreadyPresentException()
{
	
}
public RecordAlreadyPresentException(String message)
{
	super(message);
}
}
