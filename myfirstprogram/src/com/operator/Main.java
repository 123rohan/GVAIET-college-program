package com.operator;

import com.swap.SwapTwoNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArithmeticOperator arithmeticOperator=new ArithmeticOperator(20,50);
//		//arithmeticOperator.setOperand1();
//		float a=arithmeticOperator.addTwoOperands();
//		float b=arithmeticOperator.multiOperands();
//		float c=arithmeticOperator.moduleOperands();
//		
//		
//		System.out.println(a +"\n" +b+"\n"+c+"\n"+arithmeticOperator.subOperands());
////		System.out.println(b);
////		System.out.println(c);

//		
//		LogicalOperator logicalOperator= new LogicalOperator('C','C');
//		System.out.println(" "+logicalOperator.OperandOneLessThanOperandTwo()+" ");
//		
		
		
		BitwiseOperator bitwiseOperator=new BitwiseOperator();
		bitwiseOperator.setVar1(5);
		bitwiseOperator.setVar2(-3);
		
		System.out.println(bitwiseOperator.andOperation());
		System.out.println(bitwiseOperator.orOperation());
		System.out.println(bitwiseOperator.xorOperation());
		System.out.println(bitwiseOperator.leftShiftOperator());
		System.out.println(bitwiseOperator.rightShiftOperator());
		System.out.println(bitwiseOperator.rightUnsignShiftOperator());
		
		
		UnaryOperator unaryOperator=new UnaryOperator(10);
		
		int temp=unaryOperator.postDecrement() + unaryOperator.postIncrement()+unaryOperator.postDecrement();
		
		System.out.println(temp);
		System.out.println(unaryOperator.getVar1());
		
		//Swap two number
		
		SwapTwoNumber swaptwonumber=new SwapTwoNumber(10,20);
		System.out.println("Before swap "+swaptwonumber.getV1()+" "+swaptwonumber.getV2());
		swaptwonumber.swapTwoNumber();
		
		SwapTwoNumber swaptwonumber2=new SwapTwoNumber(10,20);
		System.out.println("Before swap "+swaptwonumber2.getV1()+" "+swaptwonumber2.getV2());
		swaptwonumber2.withoutThirdVar();
	}

}