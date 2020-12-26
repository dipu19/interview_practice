package com.practicecode;

public class ExceptionHandleWithTryCatch {

	public static void main(String[] args)
	{
		int[] arr = new int[4];
		//Here we are trying to insert element with the capacity of array which will throw exception without
		//try-catch block
		for(int i=0;i<=arr.length;i++)
		{
			try
			{
				arr[i] = i+1;
			}
			catch(Exception e)
			{
				System.out.println("exception occured"); 
			}
		}
		System.out.println(arr.length);
	}
}
