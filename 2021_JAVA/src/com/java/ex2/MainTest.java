package com.java.ex2;

public class MainTest {

	public static void main(String[] args) {
		//차  클래스 생성 부모클래스
		//벤츠 생성, bmw 생성 , 제네시스 생성, 포르쉐 생성  
		// ( 각 차 마다 cc,차이름 , 최대속력, 을 정의)
		//carinfo()라는 메서드를 생성하여 각 차 마다의 정보를 한번에 출력

		Benz b1 = new Benz("벤츠1",2500,270);
		b1.carinfo();
		Benz b2 = new Benz();
		b2.carinfo();
		Car car = new Car();
		
		car.print();
		b2.print();
		
		Car master = new Benz();
		Benz benz = (Benz)master;
		benz.print();
		
	}
}
