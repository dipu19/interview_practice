package com.interviewpractice;

public class GreatrString {

	public static  boolean isGreater(String string)
	{
		int lengthOfString = string.length();
		for(int i= lengthOfString-1;i>0;i--)
		{
			if(string.charAt(i)>string.charAt(i-1))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		String string = "adcb";
	    //Object greaterstring = new GreatrString();
	  if(isGreater(string))
	  {
		  System.out.println("Greater string found");
	  }
	  else
	  {
		  System.out.println("no answer");
	  }
	}
}
