
public class Tier {

	//Attribute
	String name;
	int größe;
	int gewicht;
	
	//Konstruktor
	public Tier(String name, int größe, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
		this.größe = größe;
	}
	
	//Methoden
	public void essen() {
		System.out.println("Das Tier hat gegessen");
	}
	
}
