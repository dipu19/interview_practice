package com.practicecode;

public class DuplicateWordAndOccurance {

	public void duplicateOccurance(String str)
	{
		String[] arrayString = str.split(" ");
		
		for(int i=0;i<arrayString.length-1;i++)
		{
			int noOfCount=0;
			for(int j=i+1;j<arrayString.length;j++)
			{
				boolean matched = false;
				
				
				if(arrayString[i].length() == arrayString[j].length())
				{
					int count =0;
					for(int k=0;k<arrayString[i].length();k++)
					{
						if(arrayString[i].charAt(k) == arrayString[j].charAt(k))
						{
							count = count+1;
						}
					}
					if(count == arrayString[i].length())
					{
						matched = true;
					}
				}
				if(matched == true)
				{
					
					System.out.println(arrayString[j]+" is a duplicate word present in string");
					
				}
				else
				{
					noOfCount = noOfCount+1;
				}
			}
			
			if(noOfCount == arrayString.length-1-(i))
			{
				System.out.println("There is no duplicate in the string for the word "+arrayString[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		DuplicateWordAndOccurance obj = new DuplicateWordAndOccurance();
		obj.duplicateOccurance("Ram is a good boy");
	}
}
