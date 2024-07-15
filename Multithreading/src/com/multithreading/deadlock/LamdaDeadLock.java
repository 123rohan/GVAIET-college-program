package com.multithreading.deadlock;

public class LamdaDeadLock {

	
	Object lock1;
	Object lock2;
	
	public static void main(String[] args) {
		
		
		Thread lock1 = new Thread();
		//lock1.start();
		
		Thread lock2 = new Thread();
		// lock2.start();
		
	new Thread(
			()->{
				synchronized(lock1){
					System.out.println("thread1 aquired lock1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
						
					}
					synchronized (lock2) {
						System.out.println("thread 2 aquired lock2");
					}
				}
				}).start();
	
	
	new Thread(
			()->{
				synchronized(lock2){
					System.out.println("thread2 aquired lock2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
						
					}
					synchronized (lock1) {
						System.out.println("thread 1 aquired lock1");
					}
				}
				}).start();
	
	
	}
}