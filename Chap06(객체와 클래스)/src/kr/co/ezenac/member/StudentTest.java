package kr.co.ezenac.member;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student(); //객체 생성
		student1.studentName = "이순신";		//참조변수.멤버변수
		student1.address = "서울 강남구";
		student1.studentId = 100;
		
		student1.showStudentInfo();		//참조변수.메서드
		
		
		Student student2 = new Student(); //객체 생성
		student2.studentName = "신사임당";		//참조변수.멤버변수
		student2.address = "인천 서구";
		student2.studentId = 200;
		
		student2.showStudentInfo();		//참조변수.메서드
		
		System.out.println(student1);	//객체의 주소가 저장된 참조변수를 출력
		System.out.println(student2);

		
	}

}
