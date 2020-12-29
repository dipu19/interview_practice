package com.practicecode;

class MyThread4 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am going to sleep..");
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Who disturbed me..");
			}
		}
	}
}
public class InterruptExample2 {

	public static void main(String[] args)
	{
		MyThread4 mt = new MyThread4();
		mt.start();
		mt.interrupt();
		for(int i=0;i<5;i++)
		{
			System.out.println("I am main thread..");
		}
	}
}
