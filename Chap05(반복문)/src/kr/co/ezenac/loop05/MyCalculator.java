package kr.co.ezenac.loop05;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			showMenu();
			char mychar = scanner.next().charAt(0);
			if( !checkNum(mychar) ) {
				System.out.println("메뉴를 잘못선택하셨습니다.");
				continue;
			}
			int num = mychar-'0';
			/*
			 * 			'1' - '0'
			 * 			49  -  48
			 * 			 1
			 */
			System.out.println(num);
			if(num==0) {
				break;
			}
			else {
				if (num > 4) {
					System.out.println("메뉴를 잘못선택하셨습니다.");
					continue;
				}
				//사칙연산 실행
				System.out.print("첫 번째 숫자 : ");
				int num1 = scanner.nextInt();
				
				System.out.print("두 번째 숫자 : ");
				int num2 = scanner.nextInt();
				
				if(num==1)
					addNum(num1,num2);
				else if (num==2)
					MinusNum(num1,num2);
				else if (num==3)
					MultiplyNum(num1,num2);
				else if (num==4)
					DivideNum(num1,num2);
			}
		}
		System.out.println("계산기를 종료합니다.");
		scanner.close();
	}

	public static void DivideNum(int x, int y) {
		int result1 = x / y;
		System.out.println(x + "/" + y + "=" + result1);
		
		int result2 = x % y;
		System.out.println(x + "%" + y + "=" + result2);
	}

	public static void MultiplyNum(int x, int y) {
		int result = x * y;
		System.out.println(x + "x" + y + "=" + result);	
	}

	public static void MinusNum(int x, int y) {
		int result = x - y;
		System.out.println(x + "-" + y + "=" + result);	
	}

	public static void addNum(int x, int y) {
		int result = x + y;
		System.out.println(x + "+" + y + "=" + result);	
	}

	public static boolean checkNum(char ch) {
		if( ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
	}
	//메뉴출력
	public static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("0.끝내기");
		
		
	}

}
