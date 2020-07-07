package com.interviewpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Student
{
	Integer rollNo;
	String name;
	public Student(Integer rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	
}
public class ConversionOfListToMap {

	public static void main(String[] args)
	{
		//Before java 8.
		Map<Integer,Student>studentMap = new HashMap<Integer,Student>();
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Dipu"));
		list.add(new Student(2,"Ram"));
		list.add(new Student(3,"Gopal"));
		list.add(new Student(4,"Sita"));
		
		for(Student student:list)
		{
			studentMap.put(student.rollNo, student);
		}
		
		Iterator itr =studentMap.keySet().iterator();
		while(itr.hasNext())
		{
			Integer integer = (Integer)itr.next();
			Student stud = studentMap.get(integer);
			System.out.println("name is "+stud.name+" and roll number is "+ stud.rollNo);
		}
	}
}
