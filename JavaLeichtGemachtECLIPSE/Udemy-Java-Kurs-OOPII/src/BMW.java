
public class BMW extends Auto{

	//Attribute
	boolean xDrive;
	
	
	//Konstruktoren
	public BMW(int ps, int anzahlTüren, String typ, boolean xDrive) {
		super("BMW", ps, anzahlTüren, typ);
		this.xDrive = xDrive; 
	}

	
	//Methoden
	@Override
	public void starten() {
		super.starten();
		System.out.println("Nämlich der BMW");
	}
	
}
