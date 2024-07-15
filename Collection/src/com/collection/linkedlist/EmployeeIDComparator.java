package com.collection.linkedlist;

import java.util.Comparator;

public class EmployeeIDComparator implements Comparator<Employee> {


	
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.getId(),o2.getId());
		}
}
