package kr.co.ezenac.operator;

public class PrefixPostfixTest {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(++num);	//11, num값 하나 증가 후 출력
		System.out.println(num);	//11

		System.out.println(num++);	//11, 출력 후에 값이 증가
		System.out.println(num);	//12
		
		System.out.println("-----------------------");
		
		int x = 10;
		int y = 10;
		
		System.out.println(" x = " + (x++));	//10
		System.out.println(" x = " + x);		//11
		
		System.out.println(" y = " + (++y));	//11
		System.out.println(" y = " + y);		//11

	
	}

}
