package kr.co.ezenac.decision;

import java.util.Scanner;

public class IfElseTest02 {
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0111";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = scan.nextLine();
		
		System.out.println("PW : ");
		String pw = scan.nextLine();
		
//		if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
//			System.out.println("Right");
//		} else {
//			System.out.println("Wrong");
//		}
		
		
//		if(id.equals(ADMIN_ID)) {
//			if(pw.equals(ADMIN_PASSWORD)) {
//				System.out.println("Right");
//			} else {
//				System.out.println("Wrong");
//			}
//		} else {
//			System.out.println("Wrong");
//		}
		
		
		if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("관리자 로그인 성공!");
		} else {
			System.out.println("로그인 실패");
		}
		
		
		scan.close();
	
	}

}
