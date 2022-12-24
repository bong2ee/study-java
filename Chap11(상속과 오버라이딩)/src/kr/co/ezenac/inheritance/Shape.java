package kr.co.ezenac.inheritance;

//조상 클래스
public class Shape {
	
	String color = "black";
	
	public Shape() {		//생성자
		System.out.println("Shape 클래스의 기본 생성자");
	}
	
	public void draw() {		//메서드
		System.out.println("drew()");
	}
}
