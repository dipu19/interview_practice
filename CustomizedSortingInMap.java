package com.practicecode;

import java.util.Comparator;
import java.util.TreeMap;


//Implementing Comparator interface and using our own sorting order
public class CustomizedSortingInMap {

	public static void main(String[] args)
	{
		TreeMap <Integer,Integer>map = new TreeMap<Integer,Integer>(new MyOrder()); 
		map.put(1, 10);
		map.put(2,7);
		map.put(3,18);
		map.put(4,12);
		map.put(5,20);
		System.out.println(map);
	}
}

class MyOrder implements Comparator<Object>
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 =(Integer)obj2;
		return i2.compareTo(i1);
	}
}