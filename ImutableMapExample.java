package com.interviewpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ImutableMapExample {

	public static void main(String[] args)
	{
		Map<String,String> original = new HashMap<String,String>();
		original.put("a", "I ");
		original.put("b", "am");
		original.put("c", "Don");
		Map<String,String> copyMap = Collections.unmodifiableMap(original);
		ImmutableMap<String,String> map = ImmutableMap.copyOf(original);
		
		Map <String,String>immutable = Collections.singletonMap("Key", "Value");
		
		
		System.out.println("Singleton map is "+immutable);
		Integer[] arr = {1,5,4};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list.get(2));
		Integer[] arr1 = (Integer[]) list.toArray();
		
		System.out.println((Integer)arr1[0]);
	}
}
