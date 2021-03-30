package java_backstep;

public class ArrayExam01 {
	public static void main(String[] args) {
		String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
		String[] weeks2 = {"월","화","수","목","금","토","일"};
		for(int i=0; i<weeks2.length; i++) {
			System.out.print(weeks2[i]);
		}
	}
}
