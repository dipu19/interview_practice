package com.practicecode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithComparator {

	public static void main(String[] args)
	{
		PriorityQueue <String>priorityQueue = new PriorityQueue<String>(new MyComparator1());
		
		priorityQueue.offer("Z");
		priorityQueue.offer("C");
		priorityQueue.offer("B");
		priorityQueue.offer("A");
		System.out.println(priorityQueue);
	}
}

class MyComparator1 implements Comparator<String>
{
	public int compare(String obj1, String obj2)
	{
	  return obj2.compareTo(obj1);
	}

	
}
