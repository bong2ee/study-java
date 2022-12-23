package kr.co.ezenac.anotherconstructor;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이순신", 10);	//생성자에서 생성자 호출
	}

	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public Person getPerson() {	//Person : 리턴타입
		return this;	//자기자신
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getName());
		
		Person person2 = person.getPerson();
		
		System.out.println(person);
		System.out.println(person2); //this는 자기자신을 가리킴
	}
}
