package java_backstep;

public class MethodExam02 {
	public static void main(String[] args) {
		int val[] = randMethod(5,10);
		for(int i=0; i<val.length; i++) {
			System.out.println(val);
		}
	}
	public static int[] randMethod(int n1, int n2) {
		int val = (int)(Math.random()*n1+1) + n1;
		int[] temp;
		for(int i=0; i<=n2; i++) {
			for(int j=0; j<=i; j++) {
				temp = val;
				if(val == temp) {
					j--;
					break;
				}
			}
		}
		return temp;
	}
}
