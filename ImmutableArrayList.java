package com.interviewpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableArrayList {

	public static void main(String[] args)
	{
		final List<Integer> list = new ArrayList<Integer>();
		for(int i= 1;i<5;i++)
		{
			list.add(i);
		}
		list.add(0, 6);
		List<Integer> al =  Collections.unmodifiableList(list);
		
		System.out.println(al);

	}
}
