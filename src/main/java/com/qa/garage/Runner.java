package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage g = new Garage();
		
		g.addVech(new Car(1.4, 4, "Audi", "Petrol", "White"));
		g.addVech(new Plane(4.4, 3, "Boeing", "Kerosene", 1000));
		g.addVech(new Motorcycle(0.5, 2, "Hyundi", "Diesel", false));
		
		g.output();
		g.calc();
		g.empty();
		g.output();
		

		
	}

}
