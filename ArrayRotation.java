package com.interviewpractice;

public class ArrayRotation {

	public void rotate(int[] array, int rotation)
	{
		int[] rotatedArray = array;
		
		while(rotation>0) {
			int last = rotatedArray[rotatedArray.length-1];
		for(int i=array.length-1;i>0;i--)
		{
			rotatedArray[i] = rotatedArray[i-1];
		}
		rotatedArray[0] = last;
		rotation--;
		}
		
		for(int i=0;i<rotatedArray.length;i++)
		{
			System.out.println(rotatedArray[i]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4};
		ArrayRotation arr = new ArrayRotation();
		arr.rotate(array, 2);
	}
}
