package kr.co.ezenac.constructor03;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		//기본형 차 주문 = 속성 값 지정되어 있음 => 노랑, 수동, 4
		
		Car car2 = new Car("흰색", "오토", 5);
		System.out.println(car2/* .toString() */);
		//추가생성자
	}

}
