package java_practice;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력 하세요.");
		int inputDan = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(inputDan + "*" + i +"=" + (inputDan*i));
		}
	}
}
