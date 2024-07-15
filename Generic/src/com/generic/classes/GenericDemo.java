package com.generic.classes;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.DOMStringList;

public class GenericDemo {

	public static void main(String[] args) {
		List<Integer> intList =new ArrayList<>();
		ObjectBox<Integer> intBox=new ObjectBox<>();
		
		
		intBox.setList(intList);
		
		boolean result =intBox.addElement(10);
		boolean result1 =intBox.addElement(20);
		boolean result2 =intBox.addElement(30);
		
		
		System.out.println(result);
		
		
		System.out.println(intList);
		
		
		
		List<String> stringsList=new ArrayList<>();
		ObjectBox<String> stringObjectBox=new ObjectBox<>();
		
		boolean result3=stringObjectBox.addElement("abc");
		boolean result4=stringObjectBox.addElement("abc");
		
		
		
		

		System.out.println(result2);
		
	}
}
