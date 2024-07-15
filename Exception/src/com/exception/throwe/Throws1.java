package com.exception.throwe;

public class Throws1 {

	public static void main(String[] args) {
		
		try {
			div(12, 0);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}
	
	public static void div(int num1,int num2) 
	throws RuntimeException
	{
	  System.out.println(num1/num2);	
	}
}
