package ressource;

public class CalculerGrades extends testrun {
	public static int noteE;
	public static int noteC;
	static int sommes= noteE+noteC;
	static String gradeA = "A";
	public int getSommes() {
		return sommes;
	}
	public void setSommes(int sommes) {
		CalculerGrades.sommes = sommes;
		
	}
	
	public int getNoteE() {
		return noteE;
	}

	public void setNoteE(int noteE) {
		CalculerGrades.noteE = noteE;
	}

	public int getNoteC(){
		return noteC;
	}
	public void setNoteC(int noteC) {
		CalculerGrades.noteC = noteC;
	}
	public static String calculerGrades(int noteE, int noteC) {
		if (noteC<0 && noteC>75 || noteE<0 && noteE>25) {
				
		}
		return calculerGrades(noteE, noteC);
	}
	
}
