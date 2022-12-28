package kr.co.ezenac.decorator;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {		//기본 생성자 x 호출o
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print(" 모카 시럽 추가");
	}
	

}
