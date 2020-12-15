package com.practicecode;

import java.util.ArrayList;

//Checking the number is Armstrong number or not 
public class ArmstrongNumber {

	public static boolean isArmstrong(int number)
	{
		boolean result = false;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int number1 = number;
		while(number1 >0)
		{
			ar.add(number1%10);
			number1 = number1/10;
		}
		int number2 = 0;
		for(int i=0;i<ar.size();i++)
		{
			ar.get(i);
			number2 = (int)Math.pow((double) ar.get(i), 3)+number2;
			
		}
		
		if (number2 == number)
		{
		    
			result = true;
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(isArmstrong(151));
	}
}
