package com.classstructure;

public class ClassStructure {

	//instance variable or field
	int price;
	int barcode;
	String brandName;
	
	//default constructor 
	public ClassStructure()
	{
		
		
		
	}
	//parameterized constructor
	//constructor overloading
	public ClassStructure(	int aPrice,int aBarcode,String aBrandName)
	{
		 price=aPrice;
		 barcode=aBarcode;
		 brandName=aBrandName;
		
	}
	//set price
	public void setPrice(int aPrice)
	{
		price=aPrice;
	}
	
	//set Bar code
	public void setBarcode(int aBarcode) {
		barcode = aBarcode;
	}
	//set Brand Name
	public void setBrandName(String aBrandName) {
	brandName = aBrandName;
	}
	//get price
	public int getPrice() {
		return price;
	}
	//get Brand Name
	public String getBrandName() {
		return brandName;
	}
	//get bar code
	public int getBarcode() {
		return barcode;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
