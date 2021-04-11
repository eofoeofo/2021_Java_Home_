package com.java.ex;

public class MainTest {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		Human h2 = new Human("이재진",28,01011112222);
		Human h3 = new Human("이순신",28,01011112222);
		Human h4 = new Human("이승철",51,032543545451);
		Human h5 = new Human("소녀시대",28,01011112222);
		
		
		System.out.println("이름은"+h2.getName()+h2.getAge()+h2.getPhoneNum());
	
		
		h1.setName("김상혁");
		h1.setAge(29);
		h1.setPhoneNum(010012344321);
		
		
		
		System.out.println("================================");
		
		if(h4.getName().equals("이승철")) {
			System.out.println("이사람의 이름은"+h4.getName());
		}
		
		System.out.println("이사람은 노래를 잘합니다.");
		
		
		
	}

}
