package com.practicecode;

import java.util.ArrayList;

public class RemoveDuplicateCharacterFromString {

	public void remove(String str)
	{
		ArrayList<Character> ar = new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			ar.add(str.charAt(i));
		}
		
		
		for(int i=0;i<ar.size()-1;i++)
		{
			for(int j=i+1;j<ar.size();j++)
			{
				if(ar.get(i) == ar.get(j))
				{
					ar.remove(j);
				}
			}
		}

		String result="";
		for(int i=0;i<ar.size();i++)
		{
			result = result+ar.get(i);
		}
		System.out.println(result);
	}
	public  static void  main(String[] args)
	{
		RemoveDuplicateCharacterFromString testObj = new RemoveDuplicateCharacterFromString();
		testObj.remove("Sipiti");
	}
}
