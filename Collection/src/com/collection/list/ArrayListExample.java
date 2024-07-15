package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ArrayListExample {

	
	public static void main(String[] args) {
		ArrayList<Integer> intArraylist=
				new ArrayList<>();
		
		
		intArraylist.add(1);
		intArraylist.add(2);
		intArraylist.add(3);
		intArraylist.add(4);
		intArraylist.add(5);
		System.out.println(intArraylist);
		
		
		List<String> stringslistList=new ArrayList<>();
		
		stringslistList.add("dfaasf ");
		stringslistList.add("dsf");
		stringslistList.add("dfasf");
		stringslistList.add("dfaa");
		System.out.println(stringslistList);
		
		for (int i = 0; i < stringslistList.size(); i++) {
			System.out.println(stringslistList.get(i));
		}
		
		for (int num : intArraylist) {
			System.out.println(num);
		}
		
		//for each method
		stringslistList.forEach(System.out::println);
		
		//stream api
		stringslistList.stream().forEach(System.out::println);
		
		//  Iterator 
		Iterator<Integer> intIterator =intArraylist.iterator();
		while (intIterator.hasNext()) {
			Integer integer = (Integer) intIterator.next();
			System.out.println(Integer.toBinaryString(integer));
			

 
					
			
			
			
		}
		
		
	}
}
