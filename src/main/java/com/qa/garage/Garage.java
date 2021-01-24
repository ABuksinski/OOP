package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vech = new ArrayList<Vehicle>();
	
	public void addVech(Vehicle v) {
		vech.add(v);
	}
	
	public void removeVech(Vehicle v) {
		vech.remove(v);
	}
	public void empty() {
		vech.clear();
	}
	
	public void output() {
		if(this.vech.size() != 0) {
			for(Vehicle v: vech) {
				System.out.println(v);
			}
		}else {
			System.out.println("No vehicles");
		}
	}
	
	public void calc() {
		for(Vehicle v: vech){
			int total = 0;
			if(v instanceof Car) {
//				if(v.getModel() == "Audi") {
//					
//				}
				total = v.getWheels() * 100;
				System.out.println("Total cost: " + total);
			}
			if(v instanceof Motorcycle) {
				if(((Motorcycle) v).isOffRoad()== true) {
					total = v.getWheels() * 3;
					System.out.println("Total cost: " + total);
				}else {
				total = v.getWheels() * 90;
				System.out.println("Total cost: " + total);
				}
			}
			if(v instanceof Plane) {
				total = v.getWheels() * 23440;
				System.out.println("Total cost: " + total);
			}
//			else {
//				System.out.println("not vehicle???");
//			}
		}
	}
	
}
