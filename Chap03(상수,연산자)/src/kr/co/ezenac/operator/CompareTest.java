package kr.co.ezenac.operator;

public class CompareTest {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1 > num2);		//t
		System.out.println(value);
		
		System.out.println(num1 < num2);	//f
		System.out.println(num1 >= num2);	//t
		System.out.println(num1 <= num2); 	//f
		System.out.println(num1 == num2);	//f
		System.out.println(num1 != num2); 	//t
		
		System.out.println("1.0 == 1 : " + (1.0 == 1));	//t, 실수형으로 자동 형변환이 이뤄지고 다음 비교 연산 
		System.out.println("1.0 != 1 : " + (1.0 != 1));	//f

	}

}
