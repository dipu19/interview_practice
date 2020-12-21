package com.practicecode;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args)
	{
		PriorityQueue <Integer>priorityQueue = new PriorityQueue<Integer>();
		for(int i=0;i<10;i++)
		{
			priorityQueue.offer(i);
		}
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());//to remove and return head element of the queue.
		System.out.println(priorityQueue.peek());//to return head element of the queue.
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.element());//this will also return head element of the queue if queue is null then it will throw exception
	}
}
