package com.java.ex;

public class Animal {
	String name;
	String age;
	String legNum;
	String isTail;
	
	void bark() {
		System.out.println("공통된 bark메서드");
	}
	void run() {
		System.out.println("공통된 런 메서드");
	}
	public Animal(String name, String age, String legNum, String isTail) {
		System.out.println("aniaml생성자");
		this.name = name;
		this.age = age;
		this.legNum = legNum;
		this.isTail = isTail;
	}
	
	
}
