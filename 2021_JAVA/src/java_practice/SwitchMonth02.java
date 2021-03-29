package java_practice;

import java.util.Scanner;

public class SwitchMonth02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력 하세요.");
		int month = sc.nextInt();
		
		if(month<0 && 12>month) {
			switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				System.out.println("31일 까지 존재합니다");
				break;
			case 4 : case 6 : case 9 : case 11 :
				System.out.println("30일 까지 존재합니다.");
				break;
			case 2 :
				System.out.println("28일 까지 존재합니다");
				break;
			default :
				System.out.println("잘못 입력 하셨습니다");
				break;
			}
		}
	}
}
