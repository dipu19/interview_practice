package com.practicecode;

class MyOwnCustomizedThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread "+Thread.currentThread().getName());
		Thread.currentThread().setName("baby");
		System.out.println("Child Thread "+Thread.currentThread().getName());
	}
}
public class SetThreadname {

	public static void main(String[] args)
	{
		MyOwnCustomizedThread mt = new MyOwnCustomizedThread();
		mt.start();
		System.out.println("Main thread "+Thread.currentThread().getName());
		Thread.currentThread().setName("Dipu");
		System.out.println("main thread changed to "+Thread.currentThread().getName());
	}
}
