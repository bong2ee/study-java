package kr.co.ezenac.operator;

public class AssignmentTest {

	public static void main(String[] args) {
		
		short num = 10;
		num += 77L;
		System.out.println(num); 	//87
		
		num = (short)(num + 77L);
		System.out.println(num);	//164
	}

}
