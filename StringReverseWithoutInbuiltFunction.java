package com.interviewpractice;

public class StringReverseWithoutInbuiltFunction {

	public String reverse(String str)
	{
		String result = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			result = result+str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args)
	{
		StringReverseWithoutInbuiltFunction object = new StringReverseWithoutInbuiltFunction();
	    System.out.println(object.reverse("dipu"));
	}
}
