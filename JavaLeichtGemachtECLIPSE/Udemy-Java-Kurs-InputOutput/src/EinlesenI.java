import java.util.Scanner;

public class EinlesenI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // der new-Operator erstellt ein neues Objekt von einer Klasse; Klassen sind wie Schablonen
		System.out.println("Bitte eine Zahl eingeben");
		double zahl = scan.nextDouble();
		System.out.println("Ihre Zahl lautet: " + zahl);
		
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Geben sie ihren Namen ein: ");
		String zeichenkette = scan.next();
		System.out.println("Bitte geben sie ihr Alter ein: ");
		int alter = scan2.nextInt();
		System.out.println("Ihr Name: " + zeichenkette + " 80Ihr Alter: " + alter);
	}

}
