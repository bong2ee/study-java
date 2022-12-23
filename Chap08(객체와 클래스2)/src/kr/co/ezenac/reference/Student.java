package kr.co.ezenac.reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;	//Subject 타입 + 참조변수
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject();	//멤버 참조변수
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	//setMathSubject()
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}

