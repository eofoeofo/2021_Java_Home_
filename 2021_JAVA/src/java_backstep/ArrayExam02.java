package java_backstep;

public class ArrayExam02 {
	public static void main(String[] args) {
		int[] ArrNum = new int[9];
		
		for(int i=0; i<ArrNum.length; i++) {
			ArrNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(ArrNum[i] == ArrNum[j]) {
					System.out.println(ArrNum[i]);
					System.out.println("-----2");
					i--;
				}
			}
		}
//		for(int i=0; i<ArrNum.length; i++) {
//			System.out.println(ArrNum[i]);
//		}
	}
}
