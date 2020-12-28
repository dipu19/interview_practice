package com.practicecode;

class CustomizedThread1 extends Thread
{
	public void run() 
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("I am child thread "+i);
			try {
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("I am sleeping");
			}
		}
	}
}
public class SleepMethod {

	
	
	public static void main(String[] args)
	{ 
		CustomizedThread1 ct = new CustomizedThread1();
		ct.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("I am main thread");
		}
	}
}
