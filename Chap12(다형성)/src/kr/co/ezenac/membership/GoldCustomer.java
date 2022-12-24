package kr.co.ezenac.membership;

public class GoldCustomer extends Customer {
	
	double salesRatio;

//생성자==
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
//메서드==	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
	
	public static void main(String[] args) {
		
		Customer customerK = new GoldCustomer(2024, "김유신");
		customerK.bonusPoint = 10000;
		int priceK = customerK.calcPrice(10000);
		System.out.println(customerK.showInfo() + " 지불금액은" + priceK + "원 입니다.");
	}
	
}
