package kr.co.ezenac.interfacee06;

public class EzenClassTest {

	public static void main(String[] args) {
		EzenClass eClass = new EzenClass();
		
		
		X xClass = eClass;				//자기 자신의 메소드만 보임
		xClass.x();
		Y yClass = eClass;
		yClass.y();
		
		System.out.println();
		
		EzenClass iClass = eClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();

	}

}
