package com.qa.garage;

public class Plane extends Vehicle {

	private int wingspan;

	public Plane(double enginesize, int wheels, String model, String fuelType, int wingspan) {
		super(enginesize, wheels, model, fuelType);
		this.wingspan = wingspan;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

}
