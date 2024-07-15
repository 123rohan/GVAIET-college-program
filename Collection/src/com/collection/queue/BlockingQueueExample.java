package com.collection.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueExample {

	
	public static void main(String[] args) {
		BlockingQueue<Integer> integers=new PriorityBlockingQueue<>();
		
		7
		try {
		integers.put(10);
		integers.put(4);
		integers.put(1);
		integers.put(6);
		integers.put(3);
		integers.put(10);
		
		integers.take();
		integers.take();
		integers.take();
		integers.take();
		integers.take();
		integers.take();
			System.out.println(integers);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		}
}
