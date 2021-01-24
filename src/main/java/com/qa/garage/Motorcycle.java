package com.qa.garage;

public class Motorcycle extends Vehicle {

	private boolean offRoad;

	public Motorcycle(double enginesize, int wheels, String model, String fuelType, boolean offRoad) {
		super(enginesize, wheels, model, fuelType);
		this.offRoad = offRoad;
	}

	public boolean isOffRoad() {
		return offRoad;
	}

	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}

}
