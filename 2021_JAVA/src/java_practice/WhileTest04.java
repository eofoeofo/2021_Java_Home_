package java_practice;

public class WhileTest04 {
	public static void main(String[] args) {
		int coffee = 10;
		int money = 300;
		while(money > 0) {
			System.out.println("커피를 내어 줍니다");
			coffee--;
			System.out.println("남은 커피의 양은"+ coffee +"입니다.");
			if(coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다");
				break;
			}
		}
	}
}