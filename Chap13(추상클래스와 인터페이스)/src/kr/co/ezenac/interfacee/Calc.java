package kr.co.ezenac.interfacee;

public interface Calc {
	
	double PI = 3.14;		//상수 : public static final 생략 
	int ERROR = -99999999;
	
	int add(int num1, int num2);	//구현체 없음 -> abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
}
