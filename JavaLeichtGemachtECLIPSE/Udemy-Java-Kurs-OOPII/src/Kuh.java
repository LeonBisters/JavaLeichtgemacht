
public class Kuh extends Tier {

	//Attribute
	int hufe;
	
	//Konstruktor
	public Kuh(String name, int größe, int gewicht, int hufe) {
		super(name, gewicht, größe);
		this.hufe = hufe;
	}


	
	//Methoden
	@Override
	public void essen() {
		super.essen();
		System.out.println("Die Kuh muss das Essen immer Widerkeuen");
	}
}
