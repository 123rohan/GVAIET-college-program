package com.exception.throwe;

public class Throw2 {

	public static void main(String[] args) {
		
		
		
		try {
			div(12, 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}
	
	
	public static void div(int num1,int num2) throws Exception
	,RuntimeException,IndexOutOfBoundsException{
		if (num2==0) 
			throw new Exception("can not divide by zero");
			
				
	}
}
