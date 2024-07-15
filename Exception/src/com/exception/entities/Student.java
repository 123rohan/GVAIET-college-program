package com.exception.entities;

import com.exception.customeexception.InvalidIdException;
import com.exception.customeexception.InvalidNameException;

public class  Student{

	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if (id>0) {
			this.id = id;
		}
		else {
			throw new InvalidIdException ("id should be greater than 0");
				}
		
		
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) throws InvalidNameException{
		
		if (name.length()>0) {
			this.name = name;
		}
		else {
			throw new InvalidNameException("Please write name");
				}
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	}
