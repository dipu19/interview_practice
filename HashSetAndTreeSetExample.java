package com.interviewpractice;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAndTreeSetExample {

	public static void main(String[] args)
	{
		HashSet example = new HashSet();
		example.add('n');
		example.add("Dipu");
		example.add(3);
		System.out.println(example.toString());
		TreeSet ts = new TreeSet();
		ts.add(5);
		ts.add(2);
		ts.add(8);
		System.out.println("From HashSet");
		System.out.println(ts.toString());
		HashSet hs = new HashSet(ts);
		System.out.println("Using HashSet from TreeSet");
		System.out.println(hs.toString());
	}
}
