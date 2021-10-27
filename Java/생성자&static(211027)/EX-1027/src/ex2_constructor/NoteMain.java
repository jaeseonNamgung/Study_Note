package ex2_constructor;

public class NoteMain {
	public static void main(String[] args) {

		Note n1 = new Note();
		n1.printNote();

		Note n2 = new Note(100, 5000);
		n2.printNote();

	}// main
}
