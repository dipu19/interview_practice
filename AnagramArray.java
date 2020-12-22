package com.practicecode;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramArray {

	public static void main(String[] args)
	{
	 ArrayList<String> arr=new ArrayList<String>();
	 arr.add("dipu");
	 arr.add("ipud");
	 arr.add("sipu");
	 arr.add("pusi");
	 arr.add("litu");
	 arr.add("tilu");
	 for(int i=0;i<arr.size()-1;i++)
	 {
		 for(int j=i+1;j<arr.size();j++)
		 {
			 String str1 = arr.get(i);
			 String str2 = arr.get(j);
			 if(arr.get(i).length() == arr.get(j).length())
			 {
				 ArrayList <Character>ar1 = new ArrayList<Character>();
				 ArrayList <Character>ar2 = new ArrayList<Character>();
				 int count =0;
                for(int k=0;k<str1.length();k++)
                {
                	ar1.add(str1.charAt(k));
                	ar2.add(str2.charAt(k));
                }
                Collections.sort(ar1);
                Collections.sort(ar2);
                for(int l=0;l<ar1.size();l++)
                {
                	if(ar1.get(l) == ar2.get(l))
                	{
                		count++;
                	}
                }
                if(count == ar1.size())
                {
                	System.out.println("Both "+str1+" and "+str2+" are anagram");
                	System.out.println();
                }
			 }
		 }
	 }
	}
	
	
}
