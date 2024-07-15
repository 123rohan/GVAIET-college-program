package com.collection.linkedlist;

import java.util.Comparator;

public class EmployeeComparator {

	
	
	public static Comparator<Employee> nameComparator=
			(e1,e2)->e1.getNameString().compareTo(e2.getNameString());
}
