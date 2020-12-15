package com.practicecode;

import java.util.ArrayList;

public class FibonanciSeries {

	public static ArrayList<Integer> fibo(int limit)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		int number =0;
		result.add(0);
		result.add(1);
		for(int i =2;i<limit;i++)
		{
			number = result.get(i-1)+result.get(i-2);
			result.add(number);
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(fibo(10));
	}
}
