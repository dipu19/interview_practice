package com.practicecode;

public class PrimeNumber {

	public static boolean isPrime(int number)
	{
		boolean result = false;
		int limit =  0;
		if(number <10)
		{
			limit = number;
		}
		else
		{
			limit = 10;
		}
		int count =0;
		for(int i=1;i<limit;i++)
		{
			if(number%i == 0)
			{
				count++;
				System.out.println(i);
			}
		}
		if(count >= 2)
		{
			result =false;
		}
		else {
			result = true;
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(isPrime(59));
	}
}
