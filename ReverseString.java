package com.practicecode;

public class ReverseString {

	public void reverseString(String string)
	{
	  String string1="";
	  for(int i=string.length()-1;i>=0;i--)
	  {
		  string1 = string1+string.charAt(i);
	  }
	  System.out.println(string1);
		
	}
	public static void main(String[] agrs)
	{
		String str = "Dipu";
		ReverseString obj = new ReverseString();
		obj.reverseString(str);
	}
}
