package com.customeexception.main;

import com.exception.entities.Student;

import com.exception.customeexception.*;


public class MainCustomeException {
	
	public static void main(String[] args) 
	{
		Student student=new Student();
		student.setId(109);
		
		
		try {
			student.setName(null);
		} catch (InvalidNameException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		System.out.println(student);
	
	}
}
