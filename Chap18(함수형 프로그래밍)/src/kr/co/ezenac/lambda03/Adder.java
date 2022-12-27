package kr.co.ezenac.lambda03;

import java.util.function.Function;

public class Adder implements Function<Integer, Integer> {	//자바 인터페이스

	@Override
	public Integer apply(Integer x) {
		return x + 10;
	}		
	
}
