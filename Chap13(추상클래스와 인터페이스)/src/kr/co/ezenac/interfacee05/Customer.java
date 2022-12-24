package kr.co.ezenac.interfacee05;

public class Customer implements Buy, Sell {

	public void sell() {
		System.out.println("Customer sell");
		
	}

	public void buy() {
		System.out.println("Customer buy");
		
	}
	
	public void sayWorld() {
		System.out.println("Hello");
	}

	public void order() {						
		System.out.println("customer order");
	}
}
