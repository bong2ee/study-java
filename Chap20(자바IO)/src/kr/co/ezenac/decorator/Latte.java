package kr.co.ezenac.decorator;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {		//오버로드된 생성자 
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.print("우유 추가");
	}

}
