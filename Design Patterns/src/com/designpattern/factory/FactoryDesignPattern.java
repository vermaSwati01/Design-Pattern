package com.designpattern.factory;

abstract class Vehicle {

	public abstract int getWheels();

	@Override
	public String toString() {
		return "Wheeels : " + this.getWheels();
	}

}

class Car extends Vehicle {
	int wheels;

	Car(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	}

}

class Bike extends Vehicle {
	int wheels;

	Bike(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return this.wheels;
	}

}

class VehicleFactory {
	public static Vehicle getInstance(String name, int wheels) {
		if ((name == "Car")) {
			return new Car(wheels);
		} else if (name == "Bike") {
			return new Bike(wheels);
		}

		return null;
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {

		Vehicle car = VehicleFactory.getInstance("Car", 4);

		System.out.println(car);

		Vehicle Bike = VehicleFactory.getInstance("Bike", 2);

		System.out.println(Bike);

	}

}
