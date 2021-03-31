package java_backstep;

import java.util.Scanner;

public class ArrayExam06 {
	public static void main(String[] args) {
		String[] arrSub = {"국어","영어","수학","도덕"};
		String valSub = "";
		int[] arrSco = {75,77,92,55};
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("과목명을 입력하세요.");
			valSub = sc.next();
			for(int i=0; i<arrSub.length; i++) {
				if(arrSub[i].equals(valSub)) {
					System.out.println(arrSub[i]+"의 점수 "+arrSco[i]);
				}
			}
			if(valSub.equals("그만")) {
				break;
			}
		}
	}
}
