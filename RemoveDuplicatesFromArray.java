package com.practicecode;

public class RemoveDuplicatesFromArray {

	public void duplicate(int[] array)
	{
		int length = array.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i != j)
				{
					if(array[i] == array[j])
					{
						System.out.println(array[j]);
					}
				}
				
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 2;
		arr[3] = 2;
		arr[4] = 4;
		arr[5] = 20;
		
		
		
		RemoveDuplicatesFromArray obj = new RemoveDuplicatesFromArray();
		obj.duplicate(arr);
	}
}
