package kr.co.ezenac.interfacee07;

public class MyBookShelfTest {

	public static void main(String[] args) {
		
		Queue bQueue = new MyBookShelf();
		bQueue.enQueue("배포 자동화와 지속적 인도");
		bQueue.enQueue("소프트웨어 아키텍처 이론과 실체");
		bQueue.enQueue("CERT C 프로그래밍");
		
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		System.out.println(bQueue.deQueue());
		
	}

}
