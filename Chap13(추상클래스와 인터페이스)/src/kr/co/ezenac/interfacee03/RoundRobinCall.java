package kr.co.ezenac.interfacee03;

public class RoundRobinCall implements Distribution {

	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
		
	}

	public void sendCalltoAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");
		
	}

}
