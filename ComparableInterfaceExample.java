package com.practicecode;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.TreeSet;

public class ComparableInterfaceExample {

	
	public static void main (String[] args)
	{
		TreeSet<Integer> treeSet = new TreeSet<Integer>( new MyComparator());
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(12);
		treeSet.add(8);
		treeSet.add(0);
		System.out.println(treeSet);
		
	}
}

class MyComparator implements Comparator<Object>
{
  public int compare(Object obj1,Object obj2)
  {
	  int i1 = (Integer)obj1;
	  int i2 = (Integer)obj2;
	  if(i1<i2)
	  {
		  return 1;
	  }
	  if(i1>i2)
	  {
		  return -1;
	  }
	  return 0;
  
  }


}