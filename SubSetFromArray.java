package com.practicecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubSetFromArray {

	public void subSet(int[] array)
	{
		Arrays.sort(array);
		ArrayList <Integer>length = new ArrayList<Integer>();
		for(int i=0;i<array.length-1;i++)
		{
			ArrayList <Integer>ar = new ArrayList<Integer>();
			ar.add(array[i]);
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]-array[i] <=1)
				{
					ar.add(array[j]);
				}
				if(array[i] == array[j])
				{
					i=j;
				}
			}
			System.out.println(ar);
			length.add(ar.size());
		}
		Collections.sort(length);
		System.out.println("max length of subset "+(length.get(length.size()-1)));
	}
	public static void main(String[] args)
	{
		SubSetFromArray obj = new SubSetFromArray();
		int[] array = {1,2,3,1,4,5,5,7,7,8};
		obj.subSet(array);
	}
}
