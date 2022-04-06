
public class Hund {

	// Eigenschaften
	String name;
	int alter;
	String rasse;

	// Konstruktoren
	public Hund() {

	}

	public Hund(int Alter, String name, String rasse) {
		this.alter = alter;
		this.name = name;
		this.rasse = rasse;
	}
	
	
	//Methoden
	public void bellen() {
		System.out.println("Der Hund: " + this.name + " bellt");
	}

}
