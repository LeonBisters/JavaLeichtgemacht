
public class Methoden {

	public static void main(String[] args) {
		ausgabe();
		summe();
	}
	
	public static void ausgabe() { // mit dem Schlüsselwort static sagen wir, dass wir kein objekt aus dieser Klasse erstellen müssen um auf diese Methode zuzugreifen
		System.out.println("Ich bin eine Methode");
	}
	
	public static void summe () {
		int a,b,summe ;
		a = 5;
		b = 5;
		
		summe = a + b ;
		System.out.println(summe);
	}
	
}
