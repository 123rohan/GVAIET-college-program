package com.operator;

public class TernaryOperor {

	
	int variable1;
	int variable2;
		public TernaryOperor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TernaryOperor(int variable1, int variable2) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
	}

	public int getVariable1() {
		return variable1;
	}

	public void setVariable1(int variable1) {
		this.variable1 = variable1;
	}

	public int getVariable2() {
		return variable2;
	}

	public void setVariable2(int variable2) {
		this.variable2 = variable2;
	}

	public int ternaryOperator()
	{
		return (variable1<variable2)? variable1:  variable2;
	}
	
	
}
