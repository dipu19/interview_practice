package com.interviewpractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToArray {

	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("A","abc");
		map.put("A","abc");
		map.put("B","def");
		map.put("C", "ghi");
		map.put("D", "jkl");
		Collection<String> list = map.values();
		System.out.println("Getting from collection");
		System.out.println(list.toString());
		String[] arr = (String[])list.toArray(new String[list.size()]);
		System.out.println("Getting values from array");
		System.out.println(arr[2]);
		
		//Creating Set.
		Set<String> set = new HashSet<String>(list);
		System.out.println("Getting values from set");
		System.out.println(set.toString());
		
	}
}
