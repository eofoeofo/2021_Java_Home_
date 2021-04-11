package com.java.ex2;

public class Benz extends Car{
	public Benz(String carName, int cc, int maxSpeed) {
		super(carName,cc,maxSpeed);
	}
	public Benz() {
		super("벤츠",3000,190);
	}
	@Override
	public void print() {
		System.out.println("벤츠벤츠");
	}
	
}
