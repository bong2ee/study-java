package kr.co.ezenac.member02;

public class TimeTest {

	public static void main(String[] args) {
		
		Time time = new Time();
//		time.setHour(-20); 		시간을 잘못입력하셨습니다.
		time.setHour(10);
//		System.out.println(time.getHour());		 10
		
//		System.out.println(time.toString());	 10시0분0초
		
		time.setMinute(30);
		time.setSecond(50);
		System.out.println(time.toString());
		
		time.setHour(50);
		time.setMinute(100);
		time.setSecond(100);
		System.out.println(time.toString()); //재할당x
	}

}
