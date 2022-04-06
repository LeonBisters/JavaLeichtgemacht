
public class AufgabeMethoden {

	public static void main(String[] args) {
		/*
		 * Aufgabe 
		 *
		 * 1.Wert = 3.547
		 * 2.Wert = 6.354
		 * 
		 * Definiere eine Methode, die beide Werte Multipliziert, 
		 * wobei die Werte als Parameter an die Methode übergeben werden sollen.
		 * 
		 * Der Wert soll dabei zurückgegeben werden,
		 * um ihn anschließend in der Konsole auszugeben.
		 */
		
		double wert1 = 3.547;
		double wert2 = 6.354;
		double produkt = multiplizieren(wert1, wert2);
		System.out.println("Das Produkt ist: " + produkt);
		
	}
	
	public static double multiplizieren(double wert1, double wert2) {
		
		double summe = wert1 * wert2;
		
		return summe;
		
	}
	
}
