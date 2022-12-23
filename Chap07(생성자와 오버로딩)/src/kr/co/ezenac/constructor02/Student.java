package kr.co.ezenac.constructor02;

public class Student {
		
		private String name;
		private int age;			//멤버변수
//=====================================================
		//기본생성자
		public Student() {
			System.out.println("기본 생성자 호출");
		}
		
//=====================================================
		//매개변수가 있는 생성자 추가 (overloading)
		public Student(String name, int age) {
			System.out.println("매개변수가 있는 생성자 호출");
			//super();
			this.name = name;
			this.age = age;
		}
//=====================================================
		//매개변수가 String만 있는 생성자 호출

		public Student(String name) {
			System.out.println("매개변수가 String만 있는 생성자 호출");
			//super();
			this.name = name;
		}
		//매개변수가 int만 있는 생성자 호출

		public Student(int age) {
			System.out.println("매개변수가 int만 있는 생성자 호출");
			//super();
			this.age = age;
		}
//=====================================================
		public String getName() {	//멤버 메서드
			return name;			//private에 직접 값 할당 위험 => 접근하기 위한 메서드
		}
		
		public int getAge() {
			return age;
		}
		
		@Override		//재정의, 주석처리 => 참조번지 출력
		public String toString() {
		
			return this.getName() + " , " + this.getAge();
		}
		
		
}
