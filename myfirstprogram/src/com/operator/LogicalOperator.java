package com.operator;

public class LogicalOperator {
		
	char operand1;
	char operand2;
	
	public LogicalOperator(char operand1,char operand2) {
		//super();
		this.operand1 = operand1;
		this.operand2=operand2;
		
	}

	public char getOperand1() {
		return operand1;
	}

	public void setOperand1(char operand1) {
		this.operand1 = operand1;
	}

	public char getOperand2() {
		return operand2;
	}

	public void setOperand2(char operand2) {
		this.operand2 = operand2;
	} 
	public boolean OperandOneLessThanOperandTwo()
	{
		return operand1<=operand2;
	}
	
	
}

