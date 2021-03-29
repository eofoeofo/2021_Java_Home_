package java_practice;

public class ForGuGuDan01 {
	public static void main(String[] args) {
		System.out.println("구구단 시작");
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("--------");
		}
 	}
}
