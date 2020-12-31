package com.practicecode;

public class JoinTwoString {

	public static void main(String[] args)
	{
		String s = new String("Jay");
		String s1 = new String("jagannath");
		
		//Adding two string
		String result = s+" "+s1;
		System.out.println(result);
		
		//concat two string
		 s.concat(" shree ram");
		System.out.println(s);
		
		//Comparing two string
		String s2 = new String("Jay");
   		System.out.println(s == s2);
   		String s3="Jay";
		
   		System.out.println(s.equals(s2));
   		
   		System.out.println(s == s3);
   		System.out.println(s.equals(s3));
	}
}
