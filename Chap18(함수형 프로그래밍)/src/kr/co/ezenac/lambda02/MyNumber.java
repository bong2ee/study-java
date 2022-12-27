package kr.co.ezenac.lambda02;

@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	//int getMin(int num1, int num2);		여러개 선언 -> 오류
}
