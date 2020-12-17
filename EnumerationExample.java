package com.practicecode;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args)
	{
		Vector <Integer>vector = new Vector<Integer>();
		vector.add(3);
		vector.add(4);
		vector.add(6);
		vector.add(8);
		vector.add(10);
		Enumeration<Integer> e = vector.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
