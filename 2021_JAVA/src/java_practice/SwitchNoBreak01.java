package java_practice;

public class SwitchNoBreak01 {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; // 8부터 11까지
		System.out.println("[현재시간 : " + time + " 시]");
		
		switch(time) {
		case 8 :
			System.out.println("출근합니다");
		case 9 :
			System.out.println("회의를 합니다");
		case 10 :
			System.out.println("업무를 봅니다");
		default :
			System.out.println("외근을 갑니다");
		}
	}
}
