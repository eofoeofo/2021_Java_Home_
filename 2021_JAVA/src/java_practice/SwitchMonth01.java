package java_practice;

import java.util.Scanner;

public class SwitchMonth01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력 하새요");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("겨울이다");
			break;
		case 2 : 
			System.out.println("겨울이다");
			break;
		case 3 : 
			System.out.println("봄이다");
			break;
		case 4 : 
			System.out.println("봄이다");
			break;
		case 5 : 
			System.out.println("봄이다");
			break;
		case 6 : 
			System.out.println("봄이다");
			break;
		case 7 : 
			System.out.println("여름이다");
			break;
		case 8 : 
			System.out.println("여름이다");
			break;
		case 9 : 
			System.out.println("여름이다");
			break;
		case 10 : 
			System.out.println("가을이다");
			break;
		case 11 : 
			System.out.println("가을이다");
			break;
		default :
			System.out.println("겨울이다");
		}
	}
}
