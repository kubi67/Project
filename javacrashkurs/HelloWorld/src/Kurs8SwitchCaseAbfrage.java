

public class Kurs8SwitchCaseAbfrage {
	
	public static void main(String[] agrs) {
		
		int month = 2;
		
		switch(month) {
		case 1: System.out.println("Januar"); break;
		case 2: System.out.println("Februar"); break;	//Wenn "break" fehlt, wird der nächste Monat angezeigt, bis der nächste "break" kommt.
		case 3: System.out.println("März"); break;
		case 4: System.out.println("April"); break;
		default: System.out.println("Anderer Monat"); break;
		
		}
	}
}