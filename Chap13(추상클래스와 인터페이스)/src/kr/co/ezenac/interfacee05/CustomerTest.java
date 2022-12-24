package kr.co.ezenac.interfacee05;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.sayWorld();
		customer.order();
		
		System.out.println();
		
		Buy buyer = customer;  //=new Customer(); 똑같은 것
		buyer.buy(); 			//자신의 메서드만 보임(Buy)
		
		System.out.println();
		
		Sell seller = customer;
		seller.sell(); 			//자신의 메서드만 보임(Sell)
		
		System.out.println();
		
		buyer.order();
		seller.order();
		
	}

}
