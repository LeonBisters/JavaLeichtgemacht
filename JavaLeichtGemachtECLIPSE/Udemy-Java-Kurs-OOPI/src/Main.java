
public class Main {

	public static void main(String[] args) {
		
		//Datentyp variablenName = new Konstruktor();
		
	Hund bello = new Hund(4, "Bello", "Dackel");
	bello.bellen();
	
	Hund clara = new Hund(5, "Clara", "Pudel");
	clara.bellen();
	
	
	Laptop hp = new Laptop(4, 800, "hp");
	hp.zeigeLaptop();
	
	Laptop samsungLaptop = new Laptop(8, 600, "Samsung");
	
	Laptop medionLaptop = new Laptop(4, 400, "Medion");
	
	medionLaptop.zeigeLaptop();
	samsungLaptop.zeigeLaptop();
	
	
	
	
	}
	
	
	
}
