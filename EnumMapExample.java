package com.interviewpractice;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

enum Days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumMapExample {

	public static void main(String[] args)
	{
		EnumMap<Days,String> enumMap = new EnumMap<Days,String>(Days.class);
		enumMap.put(Days.SUNDAY, "Holiday");
		enumMap.put(Days.MONDAY, "");
		enumMap.put(Days.TUESDAY, "Working Day");
		enumMap.put(Days.WEDNESDAY,"Marketing Day");
		Iterator<Days> itr = enumMap.keySet().iterator();
		enumMap.remove(Days.WEDNESDAY);
		while(itr.hasNext())
		{
			Days day = itr.next();
			System.out.println(enumMap.get(day));
		}
		Map<Days,String> map = new HashMap<Days,String>(enumMap);
		System.out.println(map.get(Days.MONDAY));
		
	}
}
