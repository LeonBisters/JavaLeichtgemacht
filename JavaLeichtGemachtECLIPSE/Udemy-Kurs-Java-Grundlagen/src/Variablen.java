
public class Variablen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Die 8 Primitiven Datentypen
		/*
		 * 
		 * byte
		 * short
		 * int 
		 * long
		 * float
		 * double
		 * boolean
		 * char
		 * 
		 */
		//<Datentyp> <Variablenname> = <Wert>
		
		int varZahl1 = 3;
		long varZahl2 = 300;
		
		double varZahl3 = 322.23;
		float varZahl4 = 23.34f; 
		/*
		 * Bei Kommazahlen geht Java immer davon aus,
		 * dass es sich um ein double handelt. 
		 * 
		 * Wenn man also eine float Zahl haben will,
		 * muss man ein "f" hinter die Zahl schreiben.
		 * 
		 * Eine Float Zahl hat einen geringeren Wertebereich,
		 * als eine Double und ist daher in manchen Fällen besser.
		 */
		
		boolean userKlick = true;
		
		char Zeichen = '!';
		
		int highscore = 0;
		System.out.println("Dein Highscore:" + highscore);
		highscore = 10;
		System.out.println("Dein Highscore:" + highscore);
		highscore = 20;
		System.out.println("Dein Highscore:" + highscore);
	}

}
