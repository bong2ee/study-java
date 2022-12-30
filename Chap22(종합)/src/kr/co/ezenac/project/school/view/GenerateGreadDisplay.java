package kr.co.ezenac.project.school.view;

import java.util.ArrayList;

import kr.co.ezenac.project.grade.BasicEvaluation;
import kr.co.ezenac.project.grade.GolfEvaluation;
import kr.co.ezenac.project.grade.GradeEvaluation;
import kr.co.ezenac.project.grade.MajorEvaluation;
import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.utils.Constant;

public class GenerateGreadDisplay {
	
	School school = School.getInstance();
	
	public static final String TITLE = "과목 학점 결과>>> \n";
	public static final String LINE = "--------------------------------------------------\n";
	public static final String HEADER = "이름	\t학번\t\t필수\t점수	학점\n";
	public static final String LINE2 = "=================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() { 
		
		ArrayList<Subject> subjects = school.getSubjects();			//모든 과목 대한 학점 계산
		
		
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makefooter(subject);
			
		}
		
		return buffer.toString();
	}

	public void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			
			if(student.getStudentName().length() >= 6) {
				buffer.append("\t");
			} else {
				buffer.append("\t\t");
			}
			buffer.append(student.getStudentId());
			buffer.append("\t");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("\t");
			GetScoreGrade(student,subject.getSubjectId());	//학생별 해당과목 학점 계산
			
			
			buffer.append("\n");
		}
		
		
		
		buffer.append(GenerateGreadDisplay.LINE2);
		
	}

	public void GetScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScores();
		int majorId = student.getMajorSubject().getSubjectId();
		int golfId = Constant.GOLF;
		
		//학점 평가 클래스
		GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation(), new GolfEvaluation()};
		
		for(int i=0; i<scoreList.size(); i++) {		//학생이 가진 점수들
			Score score = scoreList.get(i);
			
			if(score.getSubject().getSubjectId() == subjectId) {
				String grade;
				if(score.getSubject().getSubjectId() == majorId) {
					grade = gradeEvaluations[Constant.SAB_TYPE].getGrade(score.getScore());
				} else if (score.getSubject().getSubjectId() == golfId) {
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());
				}
				else 
					grade = gradeEvaluations[Constant.AB_TYPE].getGrade(score.getScore());
				
				buffer.append(score.getScore());
				buffer.append("       ");
				buffer.append(grade);
			}
		}
	}

	public void makefooter(Subject subject) {
		buffer.append("\n");
		
	}

	public void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGreadDisplay.TITLE);
		buffer.append(GenerateGreadDisplay.LINE);
		buffer.append(GenerateGreadDisplay.HEADER);
		buffer.append(GenerateGreadDisplay.LINE);
		
	}

}
