package kr.co.ezenac.member;

/* 1. 클래스는 대문자로 시작함
 * 2. java 파일 하나에 여러 개가 있을 수 있음.
 * 			- public 클래스는 하나임
 * 			- public 클래스와 .java 파일의 이름은 동일함.
 */
class A{
	
}
class B{
	
}

public class Student {
	
//	public Student() {
//		// TODO Auto-generated constructor stub
//	}			//기본 생성자

	public int studentId;
	public String studentName;
	public String address;		//멤버변수 - 인스턴스변수
	
	public void showStudentInfo() {
		System.out.println(studentId +" , " + studentName + " , " + address);
	} //멤버 메서드
	
	public String getStudentName() {
		return studentName;
	} //멤버 메서드
	
}
