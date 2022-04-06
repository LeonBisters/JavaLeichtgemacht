
public class Auto {

	// Attribute
	String marke;
	int ps;
	int anzahlTüren;
	String Typ;

	// Konstruktoren
	public Auto(String marke, int ps, int anzahlTüren, String typ) {
		super();// super steht hier da jede Klasse von Object erbt
		this.marke = marke;
		this.ps = ps;
		this.anzahlTüren = anzahlTüren;
		Typ = typ;
	}
	
	//Methoden
	public void starten() {
		System.out.println("Das Auto startet");
	}

}
