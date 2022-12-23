package kr.co.ezenac.singleton02;

/* 자동차 공장이 있습니다.
 * 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 생산될 때마다 고유의 차번호가 부여됩니다.
 *
 * 자동차 번호가 1001 부터 시작되어 차가 생산될 때마다 
 * 1002, 1003번...과 같이 번호가 부여되도록 자동차 공장 클래스, 자동차 클래스를 구현하시오.
 * 
 * 객체를 구현하여 아래처럼 실행결과가 나오도록 구현하시오.
 * 
 * 1001 (출력)
 * 1002 (출력)
 */

public class Car {
	private static int serialNum = 1000;		//static 변수
	private int carNum;							//인스턴스 변수
												//private --> set , get 필요
	
	public Car() {			//기본생성자
		Car.serialNum++;
		carNum = serialNum;
	}
	
	//get & set//

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	
	
	
	
	
}
