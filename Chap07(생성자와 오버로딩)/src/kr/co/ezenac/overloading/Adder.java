package kr.co.ezenac.overloading;

public class Adder {
	
	//add 메서드명으로 오버로딩함
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x + y;
	}

//	public int add(int a, int b) {	  변수이름 다름 -> 오버로딩x
//		return a + b;
//	}
//	
//	public long add(int x, int y) {	  리턴타입 다름 -> 오버로딩x
//		return x + y;
//	}
	
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x + y;
	}
}
