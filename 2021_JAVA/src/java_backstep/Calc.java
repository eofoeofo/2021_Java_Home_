package java_backstep;

public class Calc {
	public static void main(String[] args) {
		Calc myCalc1 = new Calc();
		Calc myCalc2 = new Calc();
		myCalc1.powerOn();
		myCalc1.powerOff();
		
		int num1 = sum(4,2);
		System.out.println(num1);
		int num2 = minus(4,5);
		System.out.println(num2);
		int num3 = multiply(12,3);
		System.out.println(num3);
		int num4 = divide(5,12);
		System.out.println(num4);
	}
	// 필드
	static int n1 = 1;
	
	// 메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
