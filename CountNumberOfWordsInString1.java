package com.practicecode;

public class CountNumberOfWordsInString1 {

	public void count(String str)
	{
		String[] word= str.split(" ");
		System.out.println("Words present in string "+word.length);
	}
	public static void main(String[] args)
	{
		CountNumberOfWordsInString1 count = new CountNumberOfWordsInString1();
		count.count("I am not a good boy");
	}
}
