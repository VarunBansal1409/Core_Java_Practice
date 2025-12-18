package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Queue {

	public static void main(String[] args) {
		
		// create a object for priority queue
					PriorityQueue p1 = new PriorityQueue();
					
					// add the elements
					p1.offer(10);
					p1.offer(20);
//					p1.offer("Hello"); //error because heterogeneous data not allowed // ClassCastException
//					p1.offer(null); // NullPointerException
					p1.offer(10);
					p1.offer(30);
					p1.offer(5);
					System.out.println(p1);
					
					// generic queue
					PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
					p2.offer(15);
					p2.offer(25);
					p2.offer(35);
					p2.offer(45);
					System.out.println(p2);
					
					// to retrieve the data present in front-end
					System.out.println(p2.peek());
					
					// to remove 
					p2.poll();
					System.out.println(p2);
		
	}
	
}
