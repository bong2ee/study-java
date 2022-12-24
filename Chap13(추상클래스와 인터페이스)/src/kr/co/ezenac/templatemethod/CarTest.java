package kr.co.ezenac.templatemethod;

public class CarTest {

	public static void main(String[] args) {
		Car dlcar = new DeepLCar();			//업캐스팅
		dlcar.run();
		
		System.out.println();
		
		Car manualCar = new ManualCar();	//업캐스팅
		manualCar.run();
		
		
	}

}
