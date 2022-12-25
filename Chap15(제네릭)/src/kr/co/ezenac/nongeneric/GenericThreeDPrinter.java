package kr.co.ezenac.nongeneric;

public class GenericThreeDPrinter<T> {
	
	private T material;			//T 자료형으로 선언한 (참조) 변수

	
	// g s
	public T getMaterial() {		//T 자료형을 반환하는 제네릭 메서드
		return material;
	}

	public void setMaterial(T material) {		//매개변수 타입 -> T 자료형
		this.material = material;
	}
	
	@Override
	public String toString() {
		
		return material.toString();
	}
	
}
