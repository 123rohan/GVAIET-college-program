package com.generic.classes;

import java.util.List;

public class ObjectBox<T> {
	
	private List<Student> zlist;

	public List<Student> getZlist() {
		return zlist;
	}

	public void setZlist(List<Student> zlist) {
		this.zlist = zlist;
	}
	
	public boolean addElement(Student t) {
		return zlist.add(t);
	}
	
	public void zforeach() {
		zlist.forEach(System.out::print);
	}
}
