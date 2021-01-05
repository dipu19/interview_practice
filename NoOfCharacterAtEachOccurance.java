package com.practicecode;

import java.util.ArrayList;
import java.util.HashMap;

public class NoOfCharacterAtEachOccurance {

	public void count(String str)
	{
		ArrayList<Character> ar = new ArrayList<Character>();
		HashMap<Character,Integer> mapOfChar = new HashMap<Character,Integer>();
		for(int i =0;i<str.length();i++)
		{
			ar.add(str.charAt(i));
			mapOfChar.put(str.charAt(i), 0);
		}
		for(int i=0;i<ar.size()-1;i++)
		{
			int count = 1;
			for(int j=i+1;j<ar.size();j++)
			{
				if(ar.get(i) == ar.get(j))
				{
					ar.remove(j);
					count++;
				}
			}
			mapOfChar.put(ar.get(i), count);
			
		}
		
		System.out.println(mapOfChar);
	}
	public static void main(String[] args)
	{
		NoOfCharacterAtEachOccurance obj = new NoOfCharacterAtEachOccurance();
		obj.count("Jay Jagannath");
	}
}
