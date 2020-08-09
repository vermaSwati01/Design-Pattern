package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable
{
	private List<String> vehicleList;
	
	public List<String> getVehicleList() {
		return vehicleList;
	}

	public Vehicle()
	{
		vehicleList = new ArrayList<String>();
	}
	
	public Vehicle(List<String> vehicleList)
	{
		this.vehicleList=vehicleList;
	}
	
	public void insert()
	{
		vehicleList.add("Maruti");
		vehicleList.add("Santro");
		vehicleList.add("Matiz");
		vehicleList.add("Balleno");
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		
		List<String> temp = new ArrayList<String>();
		for(String s : getVehicleList())
		{
			temp.add(s);
		}
		return new Vehicle(temp);
		
	}
	
	
}
public class PrototypeDesignPattern {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle a = new Vehicle();
		a.insert();
		
		Vehicle b = (Vehicle)a.clone();
		List<String> list = b.getVehicleList();
		list.add("Safari");
		
		System.out.println(a.getVehicleList());
		System.out.println(list);
	}

}
