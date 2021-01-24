package com.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person me = new Person();
		me.setName("bob");
		me.setAge(53);
		me.setAcc(342);
		System.out.println("Name: " + me.getName() + " Age: " + me.getAge());
		
	}

}
