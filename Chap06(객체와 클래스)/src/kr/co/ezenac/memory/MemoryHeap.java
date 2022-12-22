package kr.co.ezenac.memory;

public class MemoryHeap {

	public static void main(String[] args) {
		
		Book book1 = new Book();	//객체 생성
		Book book2 = new Book();	
//Book 클래스의 Book() 생성자를 이용해서 new해서(새로 만들어서)
//생성된 객체를 메모리에 적재하고 참조변수 book1에 대입시킴.
		
		book1.num = 10;		//참조변수.멤버변수에 10저장
		book2.num = 20;
		
		System.out.println(book1.num);	//출력
		System.out.println(book2.num);
		
		System.out.println(book1); //객체의 주소가 저장된 참조변수를 출력
		System.out.println(book2);
		book1 = null; //참조변수에 저장된 객체의 주소를 null값으로 초기화
		book2 = null;
		System.out.println(book1);	//null
		System.out.println(book2);

	}

}
