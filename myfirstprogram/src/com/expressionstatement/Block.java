package com.expressionstatement;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//expression and statement
		int var=10;
		
		//block
		{
			int number1=10;
			int number2=number1++;
			System.out.println(number2);
		}
		
		String message="Hello there, "+"\" how are you?\"";
		
		System.out.print(message);
		
		//String block to text block
		String mes=""" 
				
				Hello. """;
		System.out.println(mes);
	}

}
