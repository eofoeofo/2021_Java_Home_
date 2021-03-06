package java_backstep;

public class AccountingApp {
	// 공급가액
	public static double valueOfSupply = 10000.0;

	// 부가가치세율
	public static double vatRate = 0.1;

	// 부가세
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

	// 합계
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static void main(String[] args) {

		// 부가세
		double vat = getVAT();

		// 합계
		double total = getTotal();

		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
	}
}
