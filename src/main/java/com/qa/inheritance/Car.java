package com.qa.inheritance;

public class Car extends Vehicle{
	
	private String model = "A1";
	String colour = "blue";
	
	public void startCar() {
		System.out.println("Read manual for: " + this.model);
	}
	
	
	@Override
	public void wheels() {
		System.out.println("four");
		System.out.println(colour);//blue
		System.out.println(super.colour);//white
	
	}
	
	
	
}
