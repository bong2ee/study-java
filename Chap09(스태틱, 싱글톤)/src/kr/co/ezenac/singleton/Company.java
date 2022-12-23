package kr.co.ezenac.singleton;

public class Company {

	private static Company instance = new Company();	//외부에서 접근 불가능
	
	private Company() { 	//기본생성자
		
	}
	
	public static Company getInstance() {		//접근 메서드 
		
		if(instance == null)			//null이면 생성
			instance = new Company();
		
		return instance;
	}
	
}
