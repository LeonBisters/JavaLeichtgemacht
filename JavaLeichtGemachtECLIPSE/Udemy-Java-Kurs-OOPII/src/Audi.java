
public class Audi extends Auto {

	//Attribute
	boolean quattro;
	//Konstruktoren
	public Audi(int ps, int anzahlTüren, String typ, boolean quattro) {
		super("Audi", ps, anzahlTüren, typ);
		this.quattro = quattro;
	}
	
	//Methoden
	@Override
	public void starten() {
		super.starten();
		System.out.println("Nämlich der Audi");
	}
	
}
