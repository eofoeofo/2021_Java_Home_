package java_backstep;

public class Method03 {
	public static void main(String[] args) {
		double dollar = dice() + dice() + dice() + dice() + dice();
		System.out.println("획득 : $" + dollar);
		
		double profit = dollar - 18.0;
		System.out.println("손익 : $" + profit);
	}

	public static int dice() {
		return (int)(Math.random()*6)+1;
	}
	public static double exchange(double dollar) {
		return dollar * 1082.25108;
	}
}
