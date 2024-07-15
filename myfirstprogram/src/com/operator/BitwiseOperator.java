package com.operator;

public class BitwiseOperator {

	
	private int var1;
	private int var2;
	
	
	public BitwiseOperator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BitwiseOperator(int var1, int var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	
	public int andOperation()
	{
		return var1 & var2;
	}
	public int orOperation()
	{
		return var1 | var2;
	}
	public int xorOperation()
	{
		return var1 ^ var2;
	}
	public int leftShiftOperator()
	{
		return var1 << var2;
	}
	public int rightShiftOperator()
	{
		return var1 >> var2;
	}
	public int rightUnsignShiftOperator()
	{
		return var1 >>> var2;
	}
}

