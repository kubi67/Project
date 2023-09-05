package Kurs;

 public class Kurs7IfAbfragen {
	 
	 public static void main(String[] args) {
		 
		 int age = 17;
		 age = age + 1; // 17+1=18 -->Du darfst das Spiel ab 18 Kaufen
		 				//Wenn (age + 1)nicht existiert, darf er das Computerspiel nicht kaufen!-->Alter 17
		 
		 if (age > 17) {
			 System.out.println("Dann darfst Du das Computerspiel ab 18 Jahren kaufen!");
		 }
		 else {
			 System.out.println("Du darfst das Spiel leider nicht kaufen, da du zu Jung bist");
			 
		 }
	 }
 }