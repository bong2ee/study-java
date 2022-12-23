package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	ArrayList<Book> bookList;		//멤버변수
	
//매개 변수가 있는 생성자========
	public Student(int studentId, String studentName) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		
		bookList = new ArrayList<>();	//위에 선언한 것을 초기화
	}
	
//메서드====================
	public void addBook(String title, String author) {
		Book book = new Book();
	
		book.setTitle(title);
		book.setAuthor(author);
		
		bookList.add(book);	//입력받은 북을 List에 add
	}
	
	public void showInfo() {
		System.out.print(this.studentName + " 학생이 읽은 책은 : ");
	
		for (Book book : bookList)
			System.out.print(book.getTitle()+" ");
		
		System.out.println("입니다.");
	
}

}
