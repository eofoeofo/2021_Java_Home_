package java_backstep;

public class MethodRefactor {
	public static void main(String[] args) {
		printTwoTimesB();
		WhyMethod("A","!");
		WhyMethod("B","@");
		System.out.println(twoTimes("a","-"));
	}

	public static void printTwoTimesB() {
//		System.out.println("--");
//		System.out.println("B");
//		System.out.println("B");
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	public static void WhyMethod(String text,String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
}
