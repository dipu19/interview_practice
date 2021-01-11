package com.practicecode;

public class BracketSequence {

	public void count(char[] array)
	{
		int noOfFrontBracket = 0;
		int noOfBackBracket = 0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == '(')
			{
				noOfFrontBracket = noOfFrontBracket+1;
			}
			else
			{
				noOfBackBracket = noOfBackBracket+1;
			}
		}
		if(noOfFrontBracket == noOfBackBracket)
		{
			System.out.println(noOfFrontBracket+" complete bracket can be done");
		}
		else
		{
			System.out.println("incomplete sequence");
		}
	}
	public static void main(String[] args)
	{
		BracketSequence obj = new BracketSequence();
		char[] array = {'(',')','(',')','('};
		
		obj.count(array);
	}
}
