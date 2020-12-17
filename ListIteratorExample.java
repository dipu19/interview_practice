package com.practicecode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args)
	{
		List <Integer>list = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			list.add(i+1);
		}
		ListIterator<Integer> li = list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println();
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}
}
