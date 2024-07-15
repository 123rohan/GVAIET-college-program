package com.wrapperclasses.example;

public class WrapperClassesExample {
public static void main(String[] args) {
	
	
	Integer numberInteger=Integer.valueOf(10);
	
	System.out.println(numberInteger.MAX_VALUE);
	
	
	Integer intVal=Integer.valueOf(1234);
	
	StringBuilder stringBuilder=new StringBuilder(intVal.toString());
	System.out.println(stringBuilder.reverse());
}
}
