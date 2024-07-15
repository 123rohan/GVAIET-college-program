package com.operator;

public class UnaryOperator {
	
	int var1;
	public UnaryOperator(){
		
	}
	public UnaryOperator(int var1)
	{
		this.var1=var1;
		
	}
	public int getVar1()
	{
		return var1;
	}
	public void setVar1(int var1)
	{
		this.var1=var1;
	}
	public int postDecrement()
	{
		return var1--;
	}
	public int preDecrement()
	{
		return --var1;
	}
	public int postIncrement()
	{
		return var1++;
	}
	public int preIncrement()
	{
		return ++var1;
	}

}
