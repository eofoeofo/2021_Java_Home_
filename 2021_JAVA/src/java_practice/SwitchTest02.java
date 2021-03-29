package java_practice;

public class SwitchTest02 {
public static void main(String[] args) {
	int kor = 95, eng = 90, mat = 80;
	int avg = (kor+eng+mat)/3;
	
	System.out.println(avg);
		switch(avg/10) {
		case 10 :
		case 9 : System.out.println("A");
		break;
		case 8 : System.out.println("B");
		break;
		case 7 : System.out.println("C");
		break;
		case 6 : System.out.println("D");
		break;
	
		}
	}
}
