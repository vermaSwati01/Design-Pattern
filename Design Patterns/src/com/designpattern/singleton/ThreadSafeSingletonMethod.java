package com.designpattern.singleton;



class ThreadSafeMethod
{
	private static ThreadSafeMethod instance;
	
	private ThreadSafeMethod()
	{
		
	}
	
	
	public static ThreadSafeMethod returnInstance()
	{
		if(instance==null)
		{
			synchronized (ThreadSafeMethod.class) {
				if(instance==null)
				{
					instance= new ThreadSafeMethod();
				}
				
			}
		}
		
		return instance;
	}
}
public class ThreadSafeSingletonMethod {
	
	public static void main(String[] args) {
		
		ThreadSafeMethod instance = ThreadSafeMethod.returnInstance();

		System.out.println(instance);
		
		ThreadSafeMethod instance1 = ThreadSafeMethod.returnInstance();

		System.out.println(instance1);
		
		
		
	}
	
	
	

}
