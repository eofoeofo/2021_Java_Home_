package com.java.ex;

public class Human {
	private String name; // 이재진 , 28 ,0101111111
	private int age;
	private int phoneNum;
	
	Human(String name, int age, int phoneNum) {
		System.out.println("내가 값을 넣은 생성자입니다.");
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	Human(){
		super();
		System.out.println("기본 생성자입니다");
	}


	public String getName() {
		System.out.println("게터 이름 메서드");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		System.out.println("게터 에이지 메서드");
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNum() {
		System.out.println("게터 폰 메서트");
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	

	
	
}
