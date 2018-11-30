package LAInneZagadnienia;

public class OperatorInstanceof extends OperatorInstanceof2 {
	//operator instanceof umo�liwia nam sprawdzenie, czy obiekt jest danego typu
	//operator ten zwraca warto�� typu boolean
	
	public static void main(String[] args) {
		String s = null;		
		System.out.println(s instanceof String);
		
		s = "Witaj �wiecie!";		
		System.out.println(s instanceof String);
		
		s = null;		
		System.out.println(s instanceof String);
		
		//operator instanceof s�u�y jednak przede wszystkim do sprawdzania, czy jaka� klasa jest typu innej klasy
		//gdy dana klasa dziedziczy po innej klasie, to je�li sprawdzimy czy klasa 1 jest instanceof klasy po kt�rej dziedziczy
		//to wychodzi true, co przedstawia poni�szy przyk�ad:
		System.out.println();
		System.out.println("Przyk�ad z dziedziczeniem:");
		Integer number = new Integer("5");
		System.out.println(number instanceof Number);
		System.out.println("Zwr�ci�o true, poniewa� Integer dziedziczy po Number");
		System.out.println(number instanceof Object);
		System.out.println("por�wnanie z Object zawsze zwr�ci true, poniewa� ka�da klasa w javie dziedziczy z Object");
		System.out.println();
		System.out.println("Sprawdzenie obiektu klasy OperatorInstanceOf czy jest typu OperatorInstanceOf2:");
		OperatorInstanceof test = new OperatorInstanceof();
		System.out.println(test instanceof OperatorInstanceof2);
		
		//operator ten jest przydatny, gdy pisze sie og�lne procedury oparte na z�o�onej hierarchii klas
		//normalnie programista orientuje si� w hierarchii klas i nie potrzebuje tego operatora
	}
}
