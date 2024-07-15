package com.multithreading.deadlock;

public class DeadlLockExample {

	
	public Thread getThread1(Object lock1,Object lock2) {
		return new Thread(new Runnablelock1(lock1,lock2));
				
	}
	public Thread getThread2(Object lock1,Object lock2) {
		return new Thread(new Runnablelock2(lock1,lock2));
				
	}
	
	class Runnablelock1 implements Runnable{
		
		
		Object lock1;
		Object lock2;
		
		public Runnablelock1(Object lock1,Object lock2) {
			// TODO Auto-generated constructor stub
			this.lock1=lock1;
			this.lock2=lock2;
		}
		@Override
		public void run() {
			synchronized (lock1) {
				System.out.println("thread -1 acqurie lock1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				synchronized (lock2) {
					
					System.out.println("thread -2 acqurie lock1");
					
				}
				
			}
			// TODO Auto-generated method stub
			
		}
		
	}
	
		class Runnablelock2 implements Runnable{
		
		
		Object lock1;
		Object lock2;
		
		public Runnablelock2(Object lock1,Object lock2) {
			// TODO Auto-generated constructor stub
			this.lock1=lock1;
			this.lock2=lock2;
		}
		@Override
		public void run() {
			synchronized (lock2) {
				System.out.println("thread -2 acqurie lock2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				synchronized (lock1) {
					
					System.out.println("thread -1 acqurie lock2");
					
				}
				
			}
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		Object lock1=new Object();
		Object lock2=new Object();
		
		DeadlLockExample deadlLock=new DeadlLockExample();
		
		Thread thread1= deadlLock.getThread1(lock1,lock2);
		Thread thread2= deadlLock.getThread2(lock1,lock2);
	
		thread1.start();
		thread2.start();
	
	}
}
