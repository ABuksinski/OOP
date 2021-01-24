package com.qa.garage;

public class Vehicle {
	
	private double enginesize;
	private int wheels;
	private String model;
	private String fuelType;

	public Vehicle(double enginesize, int wheels, String model, String fuelType) {
		super();
		this.enginesize = enginesize;
		this.wheels = wheels;
		this.model = model;
		this.fuelType = fuelType;
	}

	public double getEnginesize() {
		return enginesize;
	}

	public void setEnginesize(double enginesize) {
		this.enginesize = enginesize;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Vehicle [enginesize=" + enginesize + ", wheels=" + wheels + ", model=" + model + ", fuelType="
				+ fuelType + "]";
	}
	
}
