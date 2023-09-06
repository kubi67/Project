
public class ZKurs13Arrays {
	
	public static void main(String[] args) {
		
		String[] names = new String[3]; //Die Größe eines Arrays wird immer bei der Initialisierung festgelegt.
										//Arrays sind wie Variablen, die mehrere Werte beinhalten können.
		
		names[0] = "Kubi";
		names[1] = "Deniz";
		names[2] = "Ahmad";
		/*
		System.out.println(names[2]);
		*/
	
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		
		//Gibt die Konsole "null" aus so ist in String kein Wert zugeschrieben
		}
	
	}
}