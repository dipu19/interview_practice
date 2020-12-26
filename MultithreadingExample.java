package com.practicecode;

class MyThreads extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("parent "+i);
		}
	}
}
public class MultithreadingExample {

	public static void main(String[] args)
	{
		MyThreads mt = new MyThreads(); 
		mt.start();
		mt.run();
		for(int i=0;i<5;i++)
		{
			System.out.println("child "+i);
		}
	}
}
