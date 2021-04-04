package java_backstep;

import java.util.Arrays;

public class MethodExam {
	public static void main(String[] args) {
		String[] arr = ArrMethod();
		System.out.println(Arrays.toString(arr));
		int n1 = intMethod(10,10);
		System.out.println(n1);
		System.out.println("--------");
		int n3 = forMethod(100);
		System.out.println(n3);
		HelloMethod();
	}
	
	public static String[] ArrMethod () {
		String[] Arr = {"김치","깍두기","파김치"};
		return Arr;
	}
	
	public static int intMethod(int n1 ,int n2) {
		return n1 * n2;
	}
	
	public static int forMethod(int n3) {
		int sum = 0;
		for(int i=0; i<=n3; i++) {
			sum += i;
		} return sum;
	}
	public static void HelloMethod() {
		System.out.println("반갑다 메소드");
	}
	
}
