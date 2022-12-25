package kr.co.ezenac.string;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = new String("ezen");
		String str2 = new String("ezen");
		
		System.out.println(str1 == str2);	//f
		
		String str3 = "ezen!";
		String str4 = "ezen!";
		
		System.out.println(str3 == str4);	//t => 상수 풀에 값 저장 
	}
}
