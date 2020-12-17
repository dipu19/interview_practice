package com.practicecode;

import java.util.ArrayList;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList();
		for(int i =0;i<6;i++)
		{
			l.add(i+1);
		}
		java.util.Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
