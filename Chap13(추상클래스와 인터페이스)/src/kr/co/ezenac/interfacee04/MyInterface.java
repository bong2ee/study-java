package kr.co.ezenac.interfacee04;

public interface MyInterface {
	int MAX_NUM = 100;
	public void method();
	
	default void dMethod() {
		System.out.println("디폴트 메서드 호출");
	}
	static void sMethod() {
		System.out.println("정적 메서드 호출");		//객체 생성과 상관없이 호출 가능
	}
	private void pMethod() {
		System.out.println("private 메서드 호출");
	}
	private static void psMethod() {
		System.out.println("private static 메서드 호출");
	}
}
