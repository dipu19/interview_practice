package com.interviewpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CopyOfList {

	public static void main(String[] args)
	{
		List<String> original =new ArrayList<String>(); 
	    original.add("Dipu");
	    original.add("Jagannath");
	    original.add("Lunu");
	    original.add("Surya");
	    List<String> copy1 = new ArrayList<String>(original);
	   // System.out.println(copy1);
	   
	    //Using stream api.
	    List<String> copy2 = original.stream().collect(Collectors.toList());
	    //System.out.println(copy2);
	    
	    List<String> copy3 = original.stream().filter(s->s.length()>=4).collect(Collectors.toList());
	    System.out.println(copy3);
	    //using loop also we can copy each element of list
	    
	    //using addAll method 
	    
	    List<String> array1 =new ArrayList<String>();
	    original.addAll(original);
	    
	  
	}
}
