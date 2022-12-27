package kr.co.ezenac.lambda04;

public class TrifunctionTest {

	public static void main(String[] args) {
		Trifunction<Integer, Integer, Integer, Integer> addThreeNums = (x, y, z) -> x + y + z;
		int result = addThreeNums.apply(2, 3, 4);
		System.out.println(result);

	}

}
