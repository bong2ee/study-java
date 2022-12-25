package kr.co.ezenac.object;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student(2022, "Ezen");
		Student student2 = new Student(2022, "Ezen");
		
		Student student3 = (Student) student1.clone();
		
		System.out.println(student1 == student2);		    //f
		System.out.println(student1.equals(student2));		//f -> 오버라이드 후 : t
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode()); 		//다름 -> 오버라이드 후 : 같음
		System.out.println(student3.hashCode()); 		//복제 -> 같음
		
		System.out.println();
//====================================================================		
		String str1 = new String("abc");		
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));		//String은 이미 오버라이드O => 같음
		
		System.out.println(str1.hashCode());		//같음
		System.out.println(str2.hashCode());
		
		System.out.println();
//====================================================================
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);				
		
		System.out.println(i1.equals(i2));			//Integer은 이미 오버라이드O => 같음
		
		System.out.println(i1.hashCode());			//같음
		System.out.println(i2.hashCode());
		
	}
}
