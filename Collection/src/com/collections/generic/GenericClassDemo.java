package com.collections.generic;

import java.security.PublicKey;

public class GenericClassDemo {

	public static void main(String[] args) {
		
		add(10,20);
		Generic<Integer> intGeneric=new Generic<Integer>(1);
		
		System.out.println(intGeneric.getT());
	
		Generic<String> intGeneric1=new Generic<>("sfsdf");
		System.out.println(intGeneric1.getT());
		
		
	}
	public static void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	
	
	
}
