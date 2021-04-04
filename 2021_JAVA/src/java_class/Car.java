package java_class;

public class Car {
	// 고유 데이터
	String company; // 제작 회사
	String model; // 모델
	String color; // 색깔
	int maxSpeed; // 최고 속도
	
	// 상태
	int speed; // 현재 속도
	int rpm; // 엔진 회전 수
	
	// 부품
//	Body body; // 차체
//	Engine engine; // 엔진
//	Tire tire; // 타이어
	
	Car(String color, String model){
		
	}
	Car(String com , String m, int spd){
		this.company = com;
		this.model = m;
		this.speed = spd;
	}
	
}
