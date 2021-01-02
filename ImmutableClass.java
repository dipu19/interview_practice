package com.practicecode;

//Immutable Class
public final class ImmutableClass {

	
	//Every method should be private so that we can not access from outside
	private int add(int i,int j)
	{
		int result = i+j;
		return result;
	}
	public static void main(String[] args)
	{
		ImmutableClass obj = new ImmutableClass();
		System.out.println(obj.add(4,5));
	}
	
}
