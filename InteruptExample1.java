package com.practicecode;

class MyThread3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("I am in sleeping state.. ");
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interrupted.. ");
		}
	}
}
public class InteruptExample1 {

	public static void main(String[] args)
	{
		MyThread3 mt = new MyThread3();
		mt.start();
		mt.interrupt();
		for(int i=0;i<10;i++)
		{
			System.out.println("I am main thread..");
		}
	}
}
