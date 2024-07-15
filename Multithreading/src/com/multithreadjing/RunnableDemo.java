package com.multithreadjing;

public class RunnableDemo implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =1; i <10; i++) {
			System.out.println(display(i));
		}	
	}
	
	
	private String display(int i) {
	return "Runnable"+i;	
	}
	}

