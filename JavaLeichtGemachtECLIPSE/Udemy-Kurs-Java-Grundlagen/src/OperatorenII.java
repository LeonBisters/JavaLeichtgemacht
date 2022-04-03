
public class OperatorenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lebenGegner = 0;
		int a = 3;
		int b = 3;
		boolean c;
		boolean hit = false;
		
		c = a < b;
		System.out.println(c);
		
		if (lebenGegner == 0 || hit == true) {
			System.out.println("Gegner zerstoert");
		}else {
			System.out.println("Gegner hat noch " + lebenGegner + " Punkte");
		}
	}

}
