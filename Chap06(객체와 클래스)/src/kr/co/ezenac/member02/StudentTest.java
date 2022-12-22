package kr.co.ezenac.member02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student(202208, "이순신", 3);
		//객체 생성
		
		
		String result = student.showStudentInfo(); //변수 <= 참조변수.메서드
		System.out.println(result);		//메서드를 수행하고 변수에 저장된 값을 출력

	}

}
