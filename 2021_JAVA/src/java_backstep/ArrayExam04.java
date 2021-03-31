package java_backstep;

public class ArrayExam04 {
	public static void main(String[] args) {
		int val = 0;
		int[] ArrVal = new int[7];
		for (int i = 0; i < ArrVal.length; i++) {
			ArrVal[i] = (int) (Math.random() * 5) + 1;
			for (int j = 0; j < i; j++) {
				if (ArrVal[i] == ArrVal[j]) {
					System.out.println(ArrVal[i]);
					i--;
				}
			}
		}
		for (int i = 0; i < ArrVal.length; i++) {
			System.out.print(ArrVal[i]);
		}
	}
}
