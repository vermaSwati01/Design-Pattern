package com.designpattern.singleton;

class SingletonLazyLoading {
	private static SingletonLazyLoading instance;

	private SingletonLazyLoading() {

	}

	public static SingletonLazyLoading returnInstance() {
		if (instance == null) {
			instance = new SingletonLazyLoading();
		}

		return instance;
	}
}

public class SingletonClassLazyLoading {

	public static void main(String[] args) {

		SingletonLazyLoading instance = SingletonLazyLoading.returnInstance();

		System.out.println(instance);

		SingletonLazyLoading instance1 = SingletonLazyLoading.returnInstance();

		System.out.println(instance1);

	}

}
