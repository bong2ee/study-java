package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectList;		//멤버변수
	
//매개 변수가 있는 생성자========
	public Student(int studentId, String studentName) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();	//위에 선언한 것을 초기화
	}
	
//메서드====================
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
	
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);	//입력받은 서브젝트를 List에 add
	}
	
	public void showInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생 " + this.studentName + "의 " 
			+ subject.getName() + " 과목 성적은 " + subject.getScorePoint() + "점 입니다.");
		}
		System.out.println("학생 "+this.studentName+"의 총점은 "+ total + "점 입니다.");
	}

}
