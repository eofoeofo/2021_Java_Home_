package java_class;

public class CarExam {
	public static void main(String[] args) {
		Car myCar = new Car("검정","그랜져");
		
		Car myCar2 = new Car("현대","제네시스",90);
		System.out.println("myCar2 company : " + myCar2.company);
		System.out.println("myCar2 model : " + myCar2.model);
		System.out.println("myCar2 speed : " + myCar2.speed);
	}
}
