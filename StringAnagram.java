package com.practicecode;

import java.util.ArrayList;
import java.util.Collections;

public class StringAnagram {

	public void checkStringAnagram(String str1,String str2)
	{
		ArrayList <Character>ar1 = new ArrayList<Character>();
		ArrayList <Character>ar2 =new ArrayList<Character>();
		
		if(str1.length() != str2.length())
		{
			System.out.println("Both strings are not anagram");
		}
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				ar1.add(str1.charAt(i));
			}
			for(int i=0;i<str1.length();i++)
			{
				ar2.add(str2.charAt(i));
			}
			Collections.sort(ar1);
			Collections.sort(ar2);
			boolean result = true;
			for(int i=0;i<str1.length();i++)
			{
				if(ar1.get(i) != ar2.get(i))
				{
				    result = false;
					break;
				}
			    result = true;
				
							
			}
			if (result == false)
			{
				System.out.println("Both strings you have entered are not anagrams");
			}
			else
			{
				System.out.println("Both strings you have entered are anagram");
			}
		}
	}
	public static void main(String[] args)
	{
		StringAnagram obj = new StringAnagram();
		obj.checkStringAnagram("dipu", "uped");
	}
}
