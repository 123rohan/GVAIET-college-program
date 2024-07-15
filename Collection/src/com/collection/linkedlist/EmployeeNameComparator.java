package com.collection.linkedlist;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{

	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getNameString().compareTo(o2.getNameString());
	}
}
