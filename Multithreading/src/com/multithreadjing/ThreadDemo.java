package com.multithreadjing;

public class ThreadDemo extends Thread {

				@Override
				public  void run() {
					// TODO Auto-generated method stub
					for (int i = 10; i >=0; i++) {
						printHello();
					}
					
				}
				
				private void printHello() {
					System.out.println("Hello");
					// TODO Auto-generated method stub
					

				}
}
