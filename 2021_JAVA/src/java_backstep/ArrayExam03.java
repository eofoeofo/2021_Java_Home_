package java_backstep;

public class ArrayExam03 {
	public static void main(String[] args) {
		int money = (int)(Math.random()*500) + 10;
		int[] coin = {500,100,50,10};
		
		System.out.printf("거스름돈은 %d원 입니다.\n",money);
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i] + "원 : " + money/coin[i] + "개");
			money = money % coin[i];
		}
	}
}
