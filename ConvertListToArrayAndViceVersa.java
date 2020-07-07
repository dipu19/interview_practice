package com.interviewpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArrayAndViceVersa {

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			list.add("no is "+i);
		}
		String[] listArray = new String[list.size()];
		listArray = list.toArray(listArray);
		System.out.println((String)listArray[2]);
		System.out.println(list.get(2));
	
		List<String> arrayList = Arrays.asList(listArray);
		System.out.println(arrayList.get(3));
	}
}
