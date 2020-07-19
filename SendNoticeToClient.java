package com.interviewpractice;

import java.util.Scanner;

public class SendNoticeToClient {

  public static int sendNotice(int[] arr,int days)
  {
	  int notice = 0;
	  if(arr.length>=days+2)
	  {
		  int rotation = arr.length-(days+2);
		  for(int i=0;i<rotation+1;i++)
		  {
			  int[] array = new int[days];
			  for(int j=0;j<days;j++)
			  {
				  array[j] = arr[j];
			  }
			  int mid = array.length/2;
			  if((2*array[mid])>=arr[i+days])
			  {
				  notice++;
			  }
		  }
	  }
	  return notice;
  }
  public static void main(String[] args)
  {
	  System.out.println("Enter the size of array");
	  Scanner sc = new Scanner(System.in);
	  int size = sc.nextInt();
	  System.out.println("Enter number of days");
	  int days = sc.nextInt();
	  int[] arr = new int[size];
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("Enter element to array");
		  arr[i] = sc.nextInt();
	  }
	  System.out.println(sendNotice(arr, days));
	  
  }
}
