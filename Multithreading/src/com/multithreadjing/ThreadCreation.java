package com.multithreadjing;

public class ThreadCreation extends Thread {
	
			private int table;
			
			public void setTable(int table)
			{
				this.table=table;
			}
	
	
		@Override
		public void run() {
		// TODO Auto-generated method stub
			for (int i = 1; i <=10; i++) {
				System.out.println(table*i);
			}
		super.run();
		}
	
	public static void main(String[] args) {
		ThreadCreation threadCreation = new ThreadCreation();
		ThreadCreation threadCreation2 = new ThreadCreation();
		
		threadCreation.setTable(10);
		threadCreation.start();
		
		threadCreation2.setTable(5);
		threadCreation2.start();
		
		
	}
}
