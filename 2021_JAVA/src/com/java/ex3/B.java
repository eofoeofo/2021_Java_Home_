package com.java.ex3;

public class B extends A{
	B(String str, int age){
		System.out.println("B생성자입니다.");
		System.out.println(str+"내이름 "+age+"나의 나이");
	}
	B() {
		System.out.println("2");
	}
	
}
