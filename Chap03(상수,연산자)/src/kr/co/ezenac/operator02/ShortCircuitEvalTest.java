package kr.co.ezenac.operator02;

public class ShortCircuitEvalTest {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		boolean result;
		
		result = ((x = x + 1) < 0) && ((y = y + 1) > 0);	// 좌항=거짓 --> 우항=연산x -> y는 그대로 0
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		result = ((x = x + 1) < 0) || ((y = y + 1) > 0);
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		

	}

}
