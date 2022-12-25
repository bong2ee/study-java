package kr.co.ezenac.generic;

public class Powder extends Material {
	
	@Override
	public String toString() {
		
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrint() {				//abstract => 오버라이드
		System.out.println("Powder 재료로 출력합니다.");
		
	}
}
