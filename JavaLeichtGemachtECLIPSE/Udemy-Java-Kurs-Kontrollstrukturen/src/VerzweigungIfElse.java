
public class VerzweigungIfElse {

	public static void main(String[] args) {
		
		int i = 10;
		if (i == 1) {
			System.out.println("Zahl in i ist: " + i);
		}else if (i >= 1) {
			System.out.println("Zahl in i ist: " + i);
		}else if (i <= 1) {
			System.out.println("Zahl in i ist: " + i);
		}else {
			System.out.println("Zahl unbekannt");
		}
		
		
		
		
		int score = 0;
		int lebenPlayer = 3;
		
		if (score == 1000) {
			System.out.println("Du hast 1 von 3 Sternen erhalten");
		}else if (score == 5000) {
			System.out.println("Du hast 2 von 3 Sternen erhalten");
		}else if (score > 5000) {
			System.out.println("Du hast 3 von 3 Sternen erhalten");
			lebenPlayer += 1;
		}else {
			System.out.println("Deine Leben betragen: " +  lebenPlayer);
		}
	}

}
