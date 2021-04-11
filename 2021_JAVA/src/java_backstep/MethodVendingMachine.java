package java_backstep;

import java.util.Scanner;

public class MethodVendingMachine {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[] arrMenu = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] arrPrice = { 1000, 1200, 1300, 1500, 2000 };
		printMenu(arrMenu, arrPrice);
		String result = choiceMenu(arrMenu,arrPrice);
		System.out.println(result);
	}
	public static void printMenu(String[] arrMenu, int[] arrPrice) {
		String str = "<메뉴>\n0 입력 시 종료\n\n";
		for (int i = 0; i < arrMenu.length; i++) {
			str += String.format("%d. %s (%,d원)\n", (i + 1), arrMenu[i], arrPrice[i]);
		}
		System.out.println(str);
	}
	public static String choiceMenu(String[] arrMenu, int[] arrPrice) {
		int money = 0;
		while (true) {
			System.out.println("선택 > ");
			int choice = sc.nextInt();
			// 예외사항을 if,else로 모두 처리 했기에 내가 원하는(1~6)은 조건문이 들어가지 않아도 된다. 
			if (choice == 0) {
				break;
			} else if (choice < 0 || choice > arrMenu.length) {
				System.out.println("잘못 선택 하셨습니다.");
				continue;
			}
			int selectIdx = choice - 1;
			System.out.printf("%s를 선택 하셨습니다.\n", arrMenu[selectIdx]);
			money += arrPrice[selectIdx];
		}
		return String.format("종료\n총 금액은 %,d원 입니다.", money);
	}
}
