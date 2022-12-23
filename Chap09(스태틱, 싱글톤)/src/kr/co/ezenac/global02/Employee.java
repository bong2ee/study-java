package kr.co.ezenac.global02;

public class Employee {
	public static int serialNum = 1000;
	private int employeeId;			//private --> get , set 필요
	private String employeeName;	//추가생성자로 직접 값 할당 x
	private String dapartment;
	
	public Employee() {			//기본생성자
		Employee.serialNum++;
		employeeId = serialNum;
	}
	
	//get&set//

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDapartment() {
		return dapartment;
	}

	public void setDapartment(String dapartment) {
		this.dapartment = dapartment;
	}
	
	
	
	
	
}
