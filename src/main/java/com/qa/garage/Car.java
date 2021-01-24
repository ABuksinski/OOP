package com.qa.garage;

public class Car extends Vehicle {

	private String colour;

	public Car(double enginesize, int wheels, String model, String fuelType, String colour) {
		super(enginesize, wheels, model, fuelType);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
