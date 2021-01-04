package com.practicecode;

//Number of character present in string
public class CountCharacterPresentInString {

	public void count(String str,String find)
	{
		int count =0;
		
		count = str.length()-str.replace(find,"").length();
		System.out.println("a "+"is present "+count+" times");
	}
	public static void main(String[] args)
	{
		CountCharacterPresentInString obj = new CountCharacterPresentInString();
		obj.count("i am a good boy", "a");
	}
}
