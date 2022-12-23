package kr.co.ezenac.constructor02;

public class StudentTest {

	public static void main(String[] args) {
		//기본생성자 호출
		Student student = new Student();
		System.out.println(student.getAge());	//값 할당x = 0출력
		System.out.println(student.toString());	//객체가 저장된 참조변수의 주소 출력
												//값 할당x = 기본값 null
		System.out.println();
		
		//매개변수가 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2.toString());	//추가 생성자 초기화
		
		System.out.println();
		
		//매개변수가 String 하나 있는 생성자 호출
		Student student3 = new Student("신사임당");	//할당안한 int값은 기본값으로 0 출력
		System.out.println(student3/* .toString() */);
		
		System.out.println();
		
		//매개변수가 int 하나 있는 생성자 호출
		Student student4 = new Student(40);			//할당안한 String값은 기본값으로 null 출력
		System.out.println(student4.toString());
	}

}
