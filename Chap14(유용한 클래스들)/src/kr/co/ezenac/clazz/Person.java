package kr.co.ezenac.clazz;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		//super();
		this.name = name;
	}

	public Person(String name, int age) {		//오버로드
		super();
		this.name = name;
		this.age = age;
	}

//=========g s	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return name;
	}
	
}
