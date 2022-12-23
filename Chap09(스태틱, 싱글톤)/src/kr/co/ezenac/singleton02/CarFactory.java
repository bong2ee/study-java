package kr.co.ezenac.singleton02;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	public CarFactory() {	//기본생성자
		
	}
	
	public static CarFactory getInstance() {		//접근 메서드
		
		if(instance == null)
			instance = new CarFactory();
		
		return instance;
	}
	
	public Car createCar() {		//자동차를 만드는 기능을 하는 메서드
		Car car = new Car();
		return car;
	}
	
}
