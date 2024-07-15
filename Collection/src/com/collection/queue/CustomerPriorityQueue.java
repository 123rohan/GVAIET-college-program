package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerPriorityQueue {

	
	public static void main(String[] args) {
		//Queue<Customer> customers=new PriorityQueue<>((e1,e2)->e1.getTypeString()
			//	.compareTo(e2.getTypeString()));
		
		 Queue<Customer> customers = new PriorityQueue<>((e1, e2) -> {
	            if (e1.getTypeString().equals("normal")) {
	                return -1; // e1 has higher priority
	            } 
	            else if (e1.getTypeString().equals("classic")) {
	                if (e2.getTypeString().equals("normal")) {
	                    return 1; // e2 has higher priority
	                }
	                else {
	                    return -1; // e1 has higher priority
	                }
	            }
	            else { // e1.getTypeString().equals("prime")
	                if (e2.getTypeString().equals("prime") || e2.getTypeString().equals("classic")) {
	                    return 1; // e2 has higher priority
	                } else {
	                    return -1; // e1 has higher priority
	                }
	            }
	        });
		customers.offer(new Customer("1"," rohan","normal"));
		customers.offer(new Customer("2"," rohit"," classic"));
		customers.offer(new Customer("3"," jatin"," prime"));
		customers.offer(new Customer("4"," kunal"," classic"));
		customers.offer(new Customer("5"," aryaman","prime"));
		
		
		
		System.out.println(customers.poll());
		System.out.println(customers.poll());
		System.out.println(customers.poll());
		System.out.println(customers.poll());
		System.out.println(customers.poll());
		
	}
}
