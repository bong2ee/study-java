package kr.co.ezenac.interfacee04;

public class MyClassTest {

	public static void main(String[] args) {
		MyInterface myinterface = new MyClass();
		myinterface.dMethod();
		myinterface.method();

		
		MyInterface.sMethod();
		
	}

}
