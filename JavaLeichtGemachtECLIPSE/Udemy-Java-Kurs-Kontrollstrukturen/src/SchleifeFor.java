
public class SchleifeFor {
	
	public static void main(String[] args) {
		/*
		 * Allgemeiner Aufbai einer for-Schleife
		 * 
		 * for (Anfangswert; Abbruchbedingun; Zähler){
		 * 
		 * }
		 */
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		for (int j = 1; j <= 10; j++ ) {
			if (j == 5) {
				System.out.println("Hey du hast mich gefunden " + j);
			}
		}
	}
	
}
