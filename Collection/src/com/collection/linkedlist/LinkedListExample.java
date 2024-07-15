package com.collection.linkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class LinkedListExample {

	
	
	public static void main(String[] args) {
		
		List<Integer> intLinkList=Arrays.asList(1,2,3,4);
		
		ListIterator<Integer> intListIterator=
				intLinkList.listIterator();
		
		int i=0;
		while (intListIterator.hasNext()) {
		System.out.println(i+":"+intListIterator.next());
		intListIterator.set(i++);
			
		}
		
		
		System.out.println("last"+intLinkList);
		intLinkList.sort(Comparable::compareTo);
		
		Collections.sort(intLinkList);
		
		List<Employee> employees=new LinkedList<>();
		
		employees.add(new Employee(1, "emp1"));
		employees.add(new Employee(2, "emp3"));
		employees.add(new Employee(3, "emp4"));
		employees.add(new Employee(4, "emp5"));
		employees.add(new Employee(5, "emp2"));
	
		employees.sort(new EmployeeIDComparator());
		System.out.println(employees);
		
		employees.sort(new EmployeeNameComparator());
		System.out.println(employees);
		
		
		Collections.sort(employees);
		System.out.println(employees);
		
		//Student
		List<Student> students=new LinkedList<>();
		
		students.add(new Student(1, 2500));
		students.add(new Student(2, 7500));
		students.add(new Student(3, 5500));
		students.add(new Student(4, 8500));
		
		students.sort((s1, s2) -> Integer.compare(s1.getRollno(), s2.getRollno()));
		System.out.println(students);
		
		students.sort((s1, s2) -> Double.compare(s1.getFees(), s2.getFees()));
		System.out.println(students);
		
		
		
		try(
				Stream<Employee> employeeStream=employees.stream())
		{
			employeeStream.sorted((e1,e2) -> e1.getNameString()
					.compareTo(e2.getNameString()))
			.forEach(System.out::println);
			
		
	}
	} 
	}
