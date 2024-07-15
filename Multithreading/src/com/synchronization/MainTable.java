package com.synchronization;

public class MainTable {

	public static void main(String[] args) {
		
		
		
		Table table = new Table(10);
		Table table1 = new Table(20);
		
		RunnableTable runnableTable1 = new RunnableTable(table);
		RunnableTable runnableTable2= new RunnableTable(table1);
		
//		table.setTable(10);
//		table1.setTable(20);
//		
		
	
	Thread thread1 = new Thread(runnableTable1);
	Thread thread2 = new Thread(runnableTable2);
	
	thread1.start();
	thread2.start();
	}
	
}
