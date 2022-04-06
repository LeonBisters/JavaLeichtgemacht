import java.util.Scanner;

public class EinlesenII {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Aufgabe 
		 * 
		 * Lese zwei Werte ein 
		 * 1. eine Ganzzahl Alter
		 * 2. Ein String Name
		 * 
		 * Gebe Alter und Name aus
		 */
		
		System.out.println("Bitte gebe dein Alter ein: ");
		int alter = scan.nextInt();
		
		System.out.println("Bitte gebe deinen Namen ein: ");
		String name = scan.next();
		
		System.out.println("Name: " + name + " Alter: " + alter);
		
	}
}
