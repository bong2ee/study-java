package kr.co.ezenac.inheritance;

public class Point {
	
	int x;
	int y;
	 
	
	public Point() {	//기본생성자
		this(0,0);
	}
	
	
	public Point(int x, int y) {	//매개변수가 있는 생성자
		//super();
		System.out.println("Point 클래스의 매개변수가 있는 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
}
