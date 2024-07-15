package com.collection.queue;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	
	
	public static void main(String[] args) {
		Queue<Integer> intQueue=new PriorityQueue<>();
		
		
		//boolean add(e)
		//enqueing
		
		intQueue.offer(10);
		intQueue.offer(9);
		intQueue.offer(1);
		intQueue.offer(19);
		intQueue.offer(10);
		intQueue.offer(67);
		System.out.println(intQueue);
		
		//Dequeing
		//E remove Poll
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
		
		
		Queue<Mail> mailQueue=new PriorityQueue<>((e1,e2)->e1.getPriorityString()
				.compareTo(e2.getPriorityString()));
		
		mailQueue.offer(new Mail("afds@fasd.in", "p4"));
		mailQueue.offer(new Mail("afds@fasd.in", "p1"));
		mailQueue.offer(new Mail("afds@fasd.in", "p1"));
		mailQueue.offer(new Mail("afds@fasd.in", "p2"));
		mailQueue.offer(new Mail("afds@fasd.in", "p2"));
		mailQueue.offer(new Mail("afds@fasd.in", "p4"));
		
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
	}
}
