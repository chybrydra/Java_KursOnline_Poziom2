package LAInneZagadnienia;

public class OperatorInstanceof extends OperatorInstanceof2 {
	//operator instanceof umo¿liwia nam sprawdzenie, czy obiekt jest danego typu
	//operator ten zwraca wartoœæ typu boolean
	
	public static void main(String[] args) {
		String s = null;		
		System.out.println(s instanceof String);
		
		s = "Witaj œwiecie!";		
		System.out.println(s instanceof String);
		
		s = null;		
		System.out.println(s instanceof String);
		
		//operator instanceof s³u¿y jednak przede wszystkim do sprawdzania, czy jakaœ klasa jest typu innej klasy
		//gdy dana klasa dziedziczy po innej klasie, to jeœli sprawdzimy czy klasa 1 jest instanceof klasy po której dziedziczy
		//to wychodzi true, co przedstawia poni¿szy przyk³ad:
		System.out.println();
		System.out.println("Przyk³ad z dziedziczeniem:");
		Integer number = new Integer("5");
		System.out.println(number instanceof Number);
		System.out.println("Zwróci³o true, poniewa¿ Integer dziedziczy po Number");
		System.out.println(number instanceof Object);
		System.out.println("porównanie z Object zawsze zwróci true, poniewa¿ ka¿da klasa w javie dziedziczy z Object");
		System.out.println();
		System.out.println("Sprawdzenie obiektu klasy OperatorInstanceOf czy jest typu OperatorInstanceOf2:");
		OperatorInstanceof test = new OperatorInstanceof();
		System.out.println(test instanceof OperatorInstanceof2);
		
		//operator ten jest przydatny, gdy pisze sie ogólne procedury oparte na z³o¿onej hierarchii klas
		//normalnie programista orientuje siê w hierarchii klas i nie potrzebuje tego operatora
	}
}
