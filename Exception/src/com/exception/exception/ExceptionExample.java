package com.exception.exception;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream;

public class ExceptionExample {

	
	public static void main(String[] args) {
		
		
		
		
//		try {
//
//			int number=12/0;
//		System.out.println("after line ");
//
//		} catch (ArithmeticException a) {
//			// TODO: handle exception
//			System.out.println(a);
//		}
//		System.out.println("dfasdfa");
	
//	try {
//		div(5423, 0);
//	} catch (ArithmeticException e) {
//		// TODO: handle exception
//		System.out.println(e);
//	}
//		try {
//			getDate("18.06.2024");
//		} catch (ParseException as) {
//			// TODO: handle exception
//			System.out.println(as);
//		}	
	
	
		
		
		
		
		int[] intArray= {1,2};
		IntStream intStream=null;
		
		try {
			intStream =Arrays.stream(intArray);
			intStream.sorted().forEach(str->System.out.print(str));
		} catch (Exception a) {
			// TODO: handle exception
			System.out.println(a);
		}
		finally {
			intStream.close();
		}
	}
//
//public static void div(int num1,int num2) {
//	System.out.println(num1/num2);
//	
//}

public static Date getDate(String dataString)  throws ParseException{
	SimpleDateFormat dateFormat=
			new SimpleDateFormat("dd.MM.yy");
	return dateFormat.parse(dataString);
}
}


