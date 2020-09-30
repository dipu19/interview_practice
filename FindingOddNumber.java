package com.practicecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingOddNumber {

	public List<Number> findOddNumber(ArrayList arr)
	{
		List<Number> oddList = new ArrayList<Number>();
		for(int i=0;i<arr.size();i++)
		{
			int number = (int)arr.get(i);
			if(number % 2 != 0)
			{
				oddList.add(number);
			}
		}
		return oddList;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array list");
		int size = sc.nextInt();
		ArrayList<Number> arr = new ArrayList<Number>(size);
		System.out.println("Enter values to arrayList");
		for(int i=0;i<size;i++)
		{
			arr.add(sc.nextInt());
		}
		
		
		FindingOddNumber obj = new FindingOddNumber();
		System.out.println(obj.findOddNumber(arr));
	}
}
