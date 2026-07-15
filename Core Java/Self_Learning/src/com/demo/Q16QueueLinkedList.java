package com.demo;

import java.util.LinkedList;
import java.util.Queue;


public class Q16QueueLinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedListQueue = new LinkedList<>();

		linkedListQueue.add("Shashi");
		linkedListQueue.add("Hrutik");
		linkedListQueue.add("Vinay");

		System.out.println("LinkedList Queue: " + linkedListQueue);

		String removed = linkedListQueue.removeFirst();
		System.out.println("Removed element: " + removed);
		System.out.println("After Dequeue: " + linkedListQueue);

		System.out.println("Peek element: " + linkedListQueue.getFirst());

		Queue<String> queue = new LinkedList<>();
	 	queue.offer("Yash");
		  queue.offer("Akshay");
	     	queue.offer("Vishnu");

		System.out.println("\nQueue Interface: " + queue);

		String polled = queue.poll();
		   System.out.println("Polled element: " + polled);
		 System.out.println("Peek element: " + queue.peek());
	}
}