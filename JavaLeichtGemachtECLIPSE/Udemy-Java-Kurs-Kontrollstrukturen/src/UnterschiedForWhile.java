import java.util.Scanner;

public class UnterschiedForWhile {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 5; i++) {
			
//		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Drücke 1 für leicht \n Drücke 2 für mittel");
		int userEingabe = scan.nextInt();
		int anzahlGegner = 0;
		if (userEingabe == 1) {
			anzahlGegner = 10;
		}else if (userEingabe == 2){
			anzahlGegner = 15;
		}else {
			System.out.println("ungültige Eingabe");
		}
		
		while(anzahlGegner != 0) {
			System.out.println("Gegener erstellt");
			anzahlGegner --;
		}
		
	}
	
}
