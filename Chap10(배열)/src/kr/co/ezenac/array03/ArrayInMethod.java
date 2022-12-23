package kr.co.ezenac.array03;

public class ArrayInMethod {

	public static void main(String[] args) {
		int[] arr = makeIntArray(5);
		int sum = sumOfArray(arr);
		System.out.println(sum);

	}

	private static int[] makeIntArray(int len) {	//메서드의 반환형으로 사용
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++)
			arr[i]=i;
		
		return arr;
	}

	private static int sumOfArray(int[] arr) {		//메서드의 매개변수로 사용
		int sum = 0;
		for(int i=0; i<arr.length; i++) 
			sum += arr[i];
		return sum;
	}
}
