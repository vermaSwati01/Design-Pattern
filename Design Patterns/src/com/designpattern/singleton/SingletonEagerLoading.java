package com.designpattern.singleton;


class Singleton{
	
	private static Singleton instance = new Singleton();
	
	private Singleton()
	{
		
	}
	
	
	public static Singleton returnInstance()
	{
		return instance;
	}
	
	
}

public class SingletonEagerLoading {
	
	
	public static void main(String[] args) {
		Singleton instance = Singleton.returnInstance();
		
		System.out.println(instance);
		
		Singleton instance1 = Singleton.returnInstance();
		
		System.out.println(instance);
		
	}

}
