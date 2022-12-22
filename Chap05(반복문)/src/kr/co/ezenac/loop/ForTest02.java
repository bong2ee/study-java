package kr.co.ezenac.loop;

//1~100까지 합을 구하는 과정에서
//처음으로 누적합계가 2000 이상이 될 때 i값을 출력
public class ForTest02 {

	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if (sum >= 2000) {
				temp = i;
				break;
			}
		}
		System.out.println("2000이상이 될 때 i 값 : " + temp);
		System.out.println("2000이상이 될 때 sum값 : " + sum);


	}

}
