
public class Laptop {
	
	//Eigenschaften
	int ram;
	int preis;
	
	String marke;
	
	//Konstruktoren
	public Laptop(int ram, int preis, String marke) {
		this.ram = ram;
		this.preis = preis;
		this.marke = marke;
	}
	
	
	//Methoden
	public void zeigeLaptop() {
		System.out.println("Ram: " + this.ram + " Preis: " + this.preis + " Marke: " + this.marke);
	}
}
