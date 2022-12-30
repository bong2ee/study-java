package kr.co.ezenac.project.grade;

public class GolfEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
			String grade;
			
		if(score >= 70) 
			grade = "P";
		 else 
			grade = "F";	
		
		return grade;
	}

}
