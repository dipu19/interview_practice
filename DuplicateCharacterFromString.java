package com.practicecode;

import java.util.Scanner;

public class DuplicateCharacterFromString {

	public void duplicate(String str)
	{
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("duplicate element is "+arr[i]);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check");
		String str = sc.next();
		DuplicateCharacterFromString testObj = new DuplicateCharacterFromString();
		testObj.duplicate(str);
	}
}
