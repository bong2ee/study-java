package kr.co.ezenac.inheritance;

public class Circle extends Shape {

	Point center;		//원점
	int radius;			//반지름
	
//생성자==========
	public Circle() {					
		this(new Point(0,0),100);		//이 값으로 밑을 호출 
	}

	public Circle(Point center, int radius) {
		//super();			==> 조상클래스 (Shape) 생성자 호출
		this.center = center;
		this.radius = radius;
	}

//메서드===========	
@Override
	public void draw() {
		System.out.println("색깔 : " + this.color);
		System.out.println("원점 : ( x : " + this.center.x+", y : "+ this.center.y+ ", 반지름 : "+ this.radius+")");
	}	
	
	
	
}
