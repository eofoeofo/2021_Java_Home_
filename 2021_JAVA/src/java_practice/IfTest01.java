package java_practice;

import java.util.Scanner;

public class IfTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요.");
		String result = "정수가 아닙니다.";
		int inputNum = sc.nextInt();
		if(inputNum % 3 == 0) {
			result = "정수 입니다.";
		} 
		System.out.println(result);
	}
}
