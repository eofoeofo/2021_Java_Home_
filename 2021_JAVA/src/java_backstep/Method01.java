package java_backstep;

public class Method01 {
	public int sum(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		Method01 myTest = new Method01();
		int c = myTest.sum(a,b);
		
		System.out.println(c);
	}
}
