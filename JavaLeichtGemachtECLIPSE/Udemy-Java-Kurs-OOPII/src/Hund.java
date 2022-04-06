
public class Hund extends Tier{//"extends" sorgt dafür, dass die Klasse Hund von der Superklasse/Elternklasse Tier erbt

	//Attribute
	int zaehne;
	
	//Konstruktor
	public Hund(String name, int größe, int gewicht, int zaehne) {
		super(name, größe, gewicht);//mit dem Schlüsselwort "super" werden die Werte an die Superklasse weitergegeben
		this.zaehne = zaehne;
	}
	
	

	//Methoden
	public void bellen() {
		
	}
	
	@Override
	public void essen() {
		System.out.println("Der Hund muss sein essen noch kauen");
		super.essen();
	}
}
