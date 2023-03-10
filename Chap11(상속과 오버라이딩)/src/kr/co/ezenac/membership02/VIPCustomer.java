package kr.co.ezenac.membership02;

public class VIPCustomer extends Customer {
	
	private int agentId;
	double salesRatio;

//	public VIPCustomer() {
//		super(1000, "SILVER");	//부모생성자 먼저 호출
//		this.customerGrade = "VIP";
//		this.bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	//private ==> get 메서드
	
	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
}
	

}
