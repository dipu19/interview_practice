package com.practicecode;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonanciSeriesUptoGivenaNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit to count ");
	    int limit = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int number =0;
		result.add(0);
		result.add(1);
		for(int i =2;i<limit;i++)
		{
			number = result.get(i-1)+result.get(i-2);
			result.add(number);
		}
		System.out.println(result);
	}
}
