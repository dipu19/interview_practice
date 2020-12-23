package com.practicecode;

import java.util.ArrayList;

public class UseThrowKeyword {

	static RuntimeException re = new RuntimeException("You have duplicate elements in arraylist");
	public static void main(String[] args)
	{
		ArrayList <Character>ar = new ArrayList<Character>();
		ar.add('D');
		ar.add('S');
		ar.add('I');
		ar.add('D');
		ar.add('S');
		ar.add('P');
		for(int i=0;i<ar.size()-1;i++)
		{
			for(int j=i+1;j<ar.size();j++)
			{
				if(ar.get(i)==ar.get(j))
				{
					throw re;
				}
			}
		}
		
		
	}
}
