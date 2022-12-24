package kr.co.ezenac.abstractclass;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();			//Computer ==> 부모타입 (업캐스팅)
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();			//NoteBook ==> 상위 클래스 (업캐스팅)
		myNote.typing();
		
	}

}
