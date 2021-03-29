package java_practice;

import java.io.IOException;

public class WhileTest03 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0, KeyCode = 0;
		
		while(run) {
			if(KeyCode!=13 && KeyCode!=10) {
				System.out.println("------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------------");
				System.out.println("선택 : ");
			}
				KeyCode = System.in.read();
				
				if (KeyCode == 49) { // 1을 읽었을 경우
					speed++;
					System.out.println("현재 속도 = " + speed);
				} else if (KeyCode == 50) { // 2를 읽었을 경우
					speed--;
					System.out.println("현재 속도 = " + speed);
				} else if (KeyCode == 51) { // 3를 읽었을 경우
					run = false;
				}
		}
		System.out.println("프로그램 종료");
	}
}
