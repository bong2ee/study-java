package kr.co.ezenac.abstractclass;

public abstract class Computer {		//추상 클래스
	abstract void display();			//추상메서드 선언 (body X)
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");		//메서드 -> body O
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
