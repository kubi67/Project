//Aufgabenstellung : Nils hat 110 Seiten eines Buches gelesen. Das Buch hat 550 Seiten. Er hat für die 110 Seiten 120Min gebraucht
//Wie lange braucht er noch um das Buch zu ende zu lesen?
public class AufgabeNilsBuch {
	
	public static void main(String[] args) {
		
		int Buch = 550;
		int Gelesen = 110; 
		int Zeit = 120; {
		System.out.println(Buch / Gelesen * Zeit - Zeit); 
		}
		
		int Lesezeit = (550 / 110 * 120 - 120);
		if (Lesezeit == 480) {
			System.out.println("Nils braucht 480 Minuten, um das Buch durch zu lesen");
			
		}
		}
		
		}	
	
