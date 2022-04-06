import java.util.Scanner;

public class VerzweigungSwitch {
	public static void main(String[] args) {
		
		/*switch(5) {
		case 0:
			System.out.println("Die Zahl ist 0");
			break;
		case 3:
			System.out.println("Die Zahl ist 3");
			break;
		case 5:
			System.out.println("Die Zahl ist 5");
			break;
		}
		*/
		
		
		
		
		System.out.println("Wie viele Bundesländer hat Deutschland");
		System.out.println("16 oder 3 oder 30 oder 15");
		
		Scanner scan = new Scanner(System.in);
		int antwort = scan.nextInt();
		
		switch (antwort) {
		case 16:
			System.out.println("Richtig");
			break;
		case 3: 
			System.out.println("Falsch");
			break;
		case 30:
			System.out.println("Falsch");
			break;
		case 15:
			System.out.println("Falsch");
			break;
			default :
				System.out.println("Zahl ist unbekannt");
		}
	}
}
