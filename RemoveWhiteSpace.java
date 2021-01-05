package com.practicecode;

import java.util.ArrayList;

public class RemoveWhiteSpace {

	public void remove(String str)
	{
		ArrayList<Character> ar = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
		{
		   if(str.charAt(i)!=' ')
		   {
		   ar.add(str.charAt(i));
		   }
		}
		String result="";
		for(int i=0;i<ar.size();i++)
		{
			result=result+ar.get(i);
		}
		System.out.println(result);
		
	}
	public static void main(String[] args)
	{
		RemoveWhiteSpace obj = new RemoveWhiteSpace();
		obj.remove("jay shree ram");
	}
}
