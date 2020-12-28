package com.practicecode;

class YieldThreadExample extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("I am child thread");
			Thread.yield();
		}
		
	}
}
public class YieldThread {

	public static void main(String[] args)
	{
		YieldThreadExample yt = new YieldThreadExample();
		yt.start();
		/* Thread.yield(); */
		for(int i=0;i<5;i++)
		{
			System.out.println("I am main thread");
			
		}
		
	}
	
}
