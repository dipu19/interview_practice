package com.practicecode;

public class CountNumberOfWordInString2 {

	public void count(String str)
	{   int count = 0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' & str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of words present in string "+count);
	}
	public static void main(String[] args)
	{
		CountNumberOfWordsInString1 obj = new CountNumberOfWordsInString1();
		obj.count("I am a good boy");
	}
}
