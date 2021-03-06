package L4Wrapping;

// TYPY LICZBOWE

public class TypyLiczbowe {
	public static void main(String[] args) {
		
		Integer liczba = new Integer(256);		
		int i = liczba.intValue(); //unboxing
		double j = liczba.doubleValue(); //inny unboxing
		System.out.println(i);						
		System.out.println(j);
		
		System.out.println();
		
		Integer liczba2 = new Integer("256");		
		i = liczba2.intValue(); //unboxing
		j = liczba2.doubleValue(); //unboxing
		System.out.println(i);						
		System.out.println(j);
	}
}

/*
Wszystkie klasy "wrapper" dziedziczą po klasie Number. Dzięki temu mają następujące metody:
byte --> byteValue()
int --> intValue()
itd.

Wszystkie klasy wrapper również posiadają dwa konstruktory: jeden z odpowiadającego mu typu prostego, drugi łańcuchowy.
Np. klasa Integer ma 2 konstruktory wyglądające następująco:
Integer(String val) oraz Integer(int val)
a klasa Double ma konstruktory: Double(String val) oraz Double(double val)
*/