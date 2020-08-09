package com.designpattern.singleton;



class ThreadSafeSingleton
{
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton()
	{
		
	}
	
	
	public static synchronized ThreadSafeSingleton returnInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}
}
public class ThreadSafeSingletonClass {
	
	
	public static void main(String[] args) {
		
		ThreadSafeSingleton instance = ThreadSafeSingleton.returnInstance();

		System.out.println(instance);
		
		ThreadSafeSingleton instance1 = ThreadSafeSingleton.returnInstance();

		System.out.println(instance1);
		
		
		
	}

}
