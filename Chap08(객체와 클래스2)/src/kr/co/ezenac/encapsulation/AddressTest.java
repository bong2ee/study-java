package kr.co.ezenac.encapsulation;

public class AddressTest {

	public static void main(String[] args) {
		
		DisplayAddress displayaddress = new DisplayAddress();
		String sbuffer = displayaddress.getAddress();
		
		System.out.println(sbuffer);

	}

}
