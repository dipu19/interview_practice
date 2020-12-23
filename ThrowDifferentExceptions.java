package com.practicecode;

import java.util.Scanner;

public class ThrowDifferentExceptions {

	
	static RuntimeException exc ;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age>18)
		{
			exc =  new RuntimeException("you are too old");
			throw exc;
		}
		if(age == 18)
		{
			exc = new RuntimeException("you are perfect");
			throw exc;
		}
		else
		{
			exc = new RuntimeException("you are not eligible");
			throw exc;
		}
	}
}
