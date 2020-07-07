package com.interviewpractice;

import java.util.HashMap;
import java.util.Map;

public class MergeFunctionInMap {

	public static void main(String[] args)
	{
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();

		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		Map<Integer,Integer> map3 = new HashMap<Integer,Integer>();
		map1.put(1,5);
		map1.put(2, 5);
		map1.put(2, null);
		map1.merge(1, 5,Integer::min );
		System.out.println(map1.get(2));
		map2.put(1,9);
		map3.merge(1, 15, Integer::sum);
		System.out.println(map3.get(1));
	}
}
