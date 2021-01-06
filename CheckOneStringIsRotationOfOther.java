package com.practicecode;

public class CheckOneStringIsRotationOfOther {

	public void check(String string1, String string2)
	{
		if(string1.length() == string2.length())
		{
			int count = 0;
			for(int i=0,j=string1.length()-1;i<string1.length()&j>=0;i++,j--)
			{
				if(string1.charAt(i) == string2.charAt(j))
				{
					count++;
				}
			}
			if(count == string1.length())
			{
				System.out.println("String is the rotation of other string");
			}
			else
			{
				System.out.println("Sorry string is not rotation of other string");
			}
		}
		else
		{
			System.out.println("Sorry..");
		}
	}
	public static void main(String[] args)
	{
		CheckOneStringIsRotationOfOther obj = new CheckOneStringIsRotationOfOther();
		obj.check("tata", "ata");
	}
}
