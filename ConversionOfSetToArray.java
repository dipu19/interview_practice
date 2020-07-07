package com.interviewpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConversionOfSetToArray {

	public static void main(String[] args)
	{
		
			//Conversion of array to set.
			Integer[] arr = {1,4,5,5};
			Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
			//System.out.println(set.toString());
			
			Set<Integer> copySet = new HashSet<Integer>();
			Collections.addAll(copySet, arr);
			System.out.println(copySet.toString());
			
			//Conversion of set to array
			
			Set<String> set1 = new HashSet<String>();
			set1.add("Dipu");
			
			set1.add("Sipu");
			set1.add("Jay");
			
			String[] arr1 = new String[set1.size()];
			set1.toArray(arr1);
			System.out.println("Conversion of set to array");
			System.out.println(set1.toString());
		}
	
}
