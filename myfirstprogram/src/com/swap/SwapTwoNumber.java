package com.swap;

public class SwapTwoNumber {

	int v1;
	int v2;
	int temp;
	public SwapTwoNumber(int v1, int v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}
	public int getV1() {
		return v1;
	}
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public int getV2() {
		return v2;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public void swapTwoNumber()
	{
		temp=v1;
		v1=v2;
		v2=temp;
		System.out.println("V1: "+v1+" "+"V2: "+v2); 
				
	}
	public void withoutThirdVar()
	{
		v1=v1+v2;
		v2=v1-v2;
		v1=v1-v2;
		System.out.println("V1: "+v1+" "+"V2: "+v2);
	}
	
}
//