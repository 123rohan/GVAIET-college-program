package com.collection.list.vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.collection.linkedlist.Employee;

public class VectorExample {

	public static void main(String[] args) {
		List<Employee> emlList=new Vector<>();
		
		List<Employee> emplist=Arrays.asList(
				new Employee(2, "emp2"),
				new Employee(3, "emp3"),
				new Employee(4, "emp4")
				);
				
		System.out.println("adding emp1");
		emlList.add(new Employee(1, "emp1"));
		
		
		Employee emp1=emlList.get(0);
		System.out.println(emp1);
		
				
		//vector to arraylist		
		emlList.addAll(emplist);
		System.out.println();
		
		
		emlList.removeIf(e->e.getNameString().equals("emp3"));
		emlList.forEach(System.out::println);
	
	
	}
}
