package kr.co.ezenac.interfacee07;

public class MyBookShelf extends BookShelf implements Queue {

	public void enQueue(String title) {
		bookshelf.add(title);
		
	}

	public String deQueue() {
		
		return (String) bookshelf.remove(0);
	}
	
	

}
