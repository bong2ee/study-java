package kr.co.ezenac.genericmethod;

public class GenericMethodTest {

	public static <T, V> double MakeRectangle(Point<T, V> p1, Point<T, V> p2) {	//포인트 자체가 자료형 매개변수로 정의되어 있음
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point</* Integer, Double */>(0, 0.0);
		Point<Integer, Double> p2 = new Point</* Integer, Double */>(10, 10.0);
		double ract = GenericMethodTest./* <Integer, Double> */MakeRectangle(p1, p2);
	
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+ ract + "입니다.");
		

	}

}
