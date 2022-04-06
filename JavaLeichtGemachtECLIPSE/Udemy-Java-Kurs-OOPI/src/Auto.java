
public class Auto {

	// Eigenschaften
	int reifen;
	int preis;

	String marke;

	// Konstruktoren
	public Auto() {// Das ist der Standardkonstruktor, der normalerweise Automatisch von Java
					// erstellt wird

	}

	public Auto(int reifen, int preis, String marke) {// Diesen Konstruktor haben wir selbst erstellt um Parameter
														// übergeben zu können
		this.reifen = reifen;// "this" sagt: geh in das erstellte Objekt; geh in die variable Reifen; weise
								// den Wert zu
		this.preis = preis;
		this.marke = marke;
	}

	public static void ausgabe() {
		System.out.println("Ich bin eine Klassenmethode und brauche kein Objekt");
	}
	
	// Methoden
	public void gasGeben() {
		System.out.println("Das auto mit der Marke: " + this.marke + " fährt gerade los");

	}

	public void bremsen() {
		System.out.println("Das Auto mit der Marke: " + this.marke + " hält jetzt an");
	}

	public void vergleichePreis(int preis) {
		if (this.preis <= preis) {
			System.out.println("Der " + this.marke + " ist billiger");
		} else {
			System.out.println("Der " + this.marke + " ist teurer");
		}
	}

}
