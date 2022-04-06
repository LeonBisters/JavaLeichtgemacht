
public class BeispielMethoden {

	public static void main(String[] args) {

		int gegnerLeben = 100;
		System.out.println("Der Boss hat: " + gegnerLeben);
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Der Boss getroffen hat: " + gegnerLeben);
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Der Boss getroffen hat: " + gegnerLeben);
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Der Boss getroffen hat: " + gegnerLeben);

	}

	public static int gegnerHit(int aktuellLeben) {

		int neuGegnerLeben;
		
		neuGegnerLeben = aktuellLeben - 20;
		
		return neuGegnerLeben;

	}

}
