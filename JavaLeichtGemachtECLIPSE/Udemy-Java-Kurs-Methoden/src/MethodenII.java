
public class MethodenII {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			erstelleGegner();
//		}

		erstelleGegner("Peter", 100);
		erstelleGegner("Olaf", 80);
	}

	public static void erstelleGegner(String name, int lebenspunkte) {
		String gegnerName = name; 
		int gegnerLeben = lebenspunkte;
		System.out.println("Gegener wurde erstellt " + gegnerName + " LP: " + gegnerLeben);
	}

//	public static void erstelleGegner() {
//		String gegnerName = Olaf;
//		int gegnerLeben = 100;
//		System.out.println("Gegner wurde erstellt");
//	}

}
