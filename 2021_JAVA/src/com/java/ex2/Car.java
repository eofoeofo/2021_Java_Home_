package com.java.ex2;

public class Car {
	private String carName;
	private int cc;
	private int maxSpeed;

	public Car(String carName, int cc, int maxSpeed) {
		this.carName = carName;
		this.cc = cc;
		this.maxSpeed = maxSpeed;
	}
	public Car() {
		
	}

	public String getCarName() {
		return carName;
	}
	public int getCc() {
		return cc;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	void carinfo() {
		System.out.println("차이름은"+this.carName+"cc는"+this.cc+"최고속력은"+this.maxSpeed);
	}
	public void print() {
		System.out.println("부릉");
	}
}
