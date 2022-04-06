import java.util.Scanner;

public class AufgabeVerzwigung {
	public static void main(String[] args) {
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("15 oder 3 oder 16 oder 30");
		Scanner scan = new Scanner(System.in);
		
		int antwort = scan.nextInt();
		
		scan.close();
		
		if (antwort == 16) {
			System.out.println("Antwort ist richtig");
		}else if (antwort == 3) {
			System.out.println("Antwort Falsch");
		}else if(antwort == 15) {
			System.out.println("Antwort Falsch");
		}else if (antwort == 30) {
			System.out.println("Antwort Falsch");
		}
	}
}
