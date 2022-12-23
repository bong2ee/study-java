package kr.co.ezenac.array02;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] score = null;		//score는 참조변수
		//score = {100, 200};	//배열 생성 안되어 있는데 값을 대입
		
		score = new int[5];
		//배열명이 곧 주소임
		System.out.println("score의 주소값 : " + score);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]=" + score[i]);		//선언 후 기본값 0으로 초기화 되어있음
		}
		
		System.out.println();
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			//범위 1~10까지의 난수를 대입
			arr[i] = (int)(Math.random()*10) + 1;
		}
		for(int i=0; i<arr.length; i++) {
			if(i != 9) {
				System.out.print(arr[i] + ", ");
			} 
			else {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
