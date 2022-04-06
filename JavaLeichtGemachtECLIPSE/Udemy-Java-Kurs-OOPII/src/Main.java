
public class Main {
	
	public static void main(String[] args) {
		
		Hund bello = new Hund("Bello", 2, 5, 42);
		bello.essen();
		
		Kuh olga = new Kuh("Olga", 150, 600, 4);
		olga.essen();
		
		BMW x1 = new BMW(130, 4, "Kompackt SUV", true);
		Audi a3 = new Audi(180, 4, "Kompaktklasse", false);
		a3.starten();
	}
	
}
