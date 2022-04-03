
public class OperatorenI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int varZahl = 5;
		
		int zahl1 = 10;
		int zahl2 = 5;
		
		int ergebnis;
		
		ergebnis = zahl1 + zahl2;
		System.out.println(ergebnis);
		
		ergebnis = zahl1 - zahl2;
		System.out.println(ergebnis);
		
		ergebnis = zahl1 * zahl2;
		System.out.println(ergebnis);
		
		ergebnis = zahl1 / zahl2;
		System.out.println(ergebnis);
		
		varZahl++;
		System.out.println(varZahl);
		
		varZahl--;
		System.out.println(varZahl);
		
		int lebenGegner = 100;
		int geschossEnergie = 20;
		
		lebenGegner = lebenGegner - geschossEnergie;
		System.out.println(lebenGegner);
		
		//Zuweisungsoperatoren
		
		lebenGegner -= geschossEnergie;
		System.out.println("Leben Gegner " + lebenGegner);
	}

}
