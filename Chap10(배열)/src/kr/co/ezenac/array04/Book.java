package kr.co.ezenac.array04;

public class Book {
	private String title;
	private String author;
	
//생성자====
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

//set&get====
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
//메서드=====
	public void showInfo() {
		System.out.println(title + ", " + author);
	}

	
}
