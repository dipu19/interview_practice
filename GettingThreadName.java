package com.practicecode;

class MyCustomizedThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Child thread "+Thread.currentThread().getName());
		}
	}
}
public class GettingThreadName {

	public static void main(String[] args)
	{
		MyCustomizedThread mt = new MyCustomizedThread();
		mt.start();
		System.out.println(mt.currentThread().getName());
	}
}
