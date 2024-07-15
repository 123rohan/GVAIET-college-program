package com.collection.linkedlist;

import javax.xml.transform.Templates;

public class Employee implements Comparable<Employee> {

	private int id;
	private String nameString;
	
	public Employee(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	@Override
	public int compareTo(Employee temp) {
		
		return Integer.compare(this.id,temp.id);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameString=" + nameString + "]";
	}
	
	
	
	
	
}
