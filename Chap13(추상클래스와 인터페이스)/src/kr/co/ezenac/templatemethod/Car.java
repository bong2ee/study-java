package kr.co.ezenac.templatemethod;

public abstract class Car {			//하나라도 abstract 가 있다면 클래스도 abstract

	final public void run() {			//run() => 템플릿 메서드		final==> 상속을 받더라도 오버라이드 X
		startCar();
		drive();
		stop();
		turnOff();
	}
	
	
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	public abstract void stop();			//추상메서드

	public abstract void drive();			//추상메서드 

	public void startCar() {				//메서드
		System.out.println("시동을 켭니다.");
	}
}
