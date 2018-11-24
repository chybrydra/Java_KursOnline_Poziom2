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
Wszystkie klasy "wrapper" dziedzicz¹ po klasie Number. Dziêki temu maj¹ nastêpuj¹ce metody:
byte --> byteValue()
int --> intValue()
itd.

Wszystkie klasy wrapper równie¿ posiadaj¹ dwa konstruktory: jeden z odpowiadaj¹cego mu typu prostego, drugi ³añcuchowy.
Np. klasa Integer ma 2 konstruktory wygl¹daj¹ce nastêpuj¹co:
Integer(String val) oraz Integer(int val)
a klasa Double ma konstruktory: Double(String val) oraz Double(double val)
*/