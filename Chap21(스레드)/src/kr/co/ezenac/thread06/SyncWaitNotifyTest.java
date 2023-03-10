package kr.co.ezenac.thread06;

import java.util.ArrayList;

class EzenBooks {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public EzenBooks() {
		shelf.add("퀀트의 세계1");
		shelf.add("퀀트의 세계2");
		shelf.add("퀀트의 세계3");
//		shelf.add("퀀트의 세계4");
//		shelf.add("퀀트의 세계5");
//		shelf.add("퀀트의 세계6");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		while(shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + "빌리는 것 기다림 시작");
			wait();
			System.out.println(Thread.currentThread().getName() + "빌리는 것 기다림 종료");
		}
		
		String book = shelf.remove(0);
		
		System.out.println(Thread.currentThread().getName() + " : " + book + "빌림");
		return book;
	}
	
	public synchronized void returnBook(String book) {
		shelf.add(book);
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + book + "반납함");
	}
}

class Person extends Thread {
	
	@Override
	public void run() {
		try {
			String title = SyncWaitNotifyTest.ezenBooks.lendBook();
			if (title == null) return;
			Thread.sleep(5000);
			SyncWaitNotifyTest.ezenBooks.returnBook(title);
			
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}



public class SyncWaitNotifyTest {
	
	public static EzenBooks ezenBooks = new EzenBooks();
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		Person person6 = new Person();
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
	}

}
