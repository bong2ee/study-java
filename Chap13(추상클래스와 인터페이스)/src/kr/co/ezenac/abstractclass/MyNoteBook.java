package kr.co.ezenac.abstractclass;

public class MyNoteBook extends NoteBook {

	@Override
	void display() {		// NoteBook에서 구현 안 한 나머지 하나 메서드 
		System.out.println("MyNoteBook");		
	}

}
