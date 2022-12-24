package kr.co.ezenac.interfacee07;

import java.util.ArrayList;

//책꽂이
public class BookShelf {
	
	protected ArrayList<String> bookshelf;		//선언
	
	public BookShelf() {
		bookshelf = new ArrayList<String>();			//생성자 -> 초기화
	}
	
	public ArrayList<String> getBookShelf(){
		return bookshelf;
	}
	
	public int getCount() {
		return bookshelf.size();
	}
	
	
}
