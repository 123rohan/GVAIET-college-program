package com.collection.linkedlist;

public class Student implements Comparable<Student> {

	
	
	private int rollno;
	private double fees;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Student(int rollno, double fees) {
		super();
		this.rollno = rollno;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", fees=" + fees + "]";
	}
	
	@Override
	public int compareTo(Student temp) {
		// TODO Auto-generated method stub
		return Integer.compare(this.rollno, temp.rollno);
	}
}
