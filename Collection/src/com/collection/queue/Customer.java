package com.collection.queue;

public class Customer implements Comparable<Customer> {

	
	private String idString;
	private String nameString;
	private String typeString;
	
	public Customer(String idString, String nameString, String typeString) {
		super();
		this.idString = idString;
		this.nameString = nameString;
		this.typeString = typeString;
	}
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	@Override
	public String toString() {
		return "Customer [idString=" + idString + ", nameString=" + nameString + ", typeString=" + typeString + "]";
	}
	
	
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.typeString.compareTo(o.getTypeString());
	}
	
	
	
	
	}
	
	


