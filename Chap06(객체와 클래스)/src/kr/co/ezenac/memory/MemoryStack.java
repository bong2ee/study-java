package kr.co.ezenac.memory;

public class MemoryStack {
				//int반환타입, add메서드명, 매개변수(지역변수)
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;	//결과 반환
	}	//메서드 : 메서드 내에 선언된 변수는 메서드 내에서만 사용
		
	public static void main(String[] args) {
		int number1 = 10;	//지역변수
		int number2 = 20;	//지역변수
		int result = add(number1, number2); 	//메서드호출,매개변수(지역변수)
		System.out.println("result : =======" + result);
		
	}

}
