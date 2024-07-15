package com.operator;

public class ArithmeticOperator {

	
		// TODO Auto-generated method stub
		private float operand1=20;
		private float operand2=50;
		
//		public ArithmeticOperator()
//		{
//			
//		}
		public ArithmeticOperator(float operand1,float operand2)
		{
			this.operand1=operand1;
			this.operand2=operand2;
		}
		
		public float getOperand1()
		{
			return operand1;
		}
		public void setOperand1(float operand1)
		{
			this.operand1=operand1;
		}
		public float getOperand2()
		{
			return operand2;
		}
		public void setOperand2(float operand2)
		{
			this.operand2=operand2;
		}
		
		
		
		public float addTwoOperands()
		{
			return operand1+operand2;
		}
		public float multiOperands()
		{
			return operand1*operand2;
		}
		public float moduleOperands()
		{
			return operand1%operand2;
		}
		
		public float subOperands()
		{
			return operand1-operand2;
		}
		
	

	}


