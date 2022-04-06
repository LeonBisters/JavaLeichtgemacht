
public class MethodenReturnII {

	public static void main(String[] args) {
		int a = summe();
		System.out.println("Der Wert aus der MEthode Summe ist: " + a);
		
		int summe = a - 5;
		System.out.println("Der Wert in Summe ist " + summe);
	}
	
	public static int summe() {
		int a,b,summe;
		a = 5;
		b = 5;
		summe = a + b;
		
		return summe;
	}
	
}
