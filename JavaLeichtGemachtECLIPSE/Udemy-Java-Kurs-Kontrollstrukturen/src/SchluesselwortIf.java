
public class SchluesselwortIf {

	public static void main(String[] args) {
		
		int score = 4000;
		
		if (score == 5000) {
			System.out.println("Neuer Rekord");
		}else {
			System.out.println("Schade dein Score reicht leider nicht");
		}
		
		
		int lebenPlayer = 3;
		
		if(lebenPlayer == 0) {
			System.out.println("Spiel verloren");
		}else {
			
		}
		
		
		boolean gegnerHit = false;
		int highscore = 0;
		
		if (gegnerHit == true) {
			System.out.println("Gegner getroffen");
			highscore += 10;
			System.out.println( "Highscor: "+ highscore);
		}else {
			System.out.println("daneben");
		}
		
	}
}
