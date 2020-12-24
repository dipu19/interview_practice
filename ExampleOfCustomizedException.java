package com.practicecode;

class CustomizedException1 extends RuntimeException
{
	CustomizedException1(String str)
	{
		System.out.println(str);
	}
}
public class ExampleOfCustomizedException {

	String str = "";
	CustomizedException1 customizedException ;
	
	public void age(int age)
	{
		if(age>29)
		{
			str = "Your age is eligible for marriage";
			throw new CustomizedException1(str);
		}
		else
		{
			str = "Your age is not eligible for marriage";
			throw new CustomizedException1(str);
		}
	}
	public static void main(String[] args)
	{
		ExampleOfCustomizedException obj  = new ExampleOfCustomizedException();
		obj.age(43);
	}
}
