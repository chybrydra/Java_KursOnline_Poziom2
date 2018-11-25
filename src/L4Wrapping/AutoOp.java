package L4Wrapping;

//korzystanie z typów prostych jest bardziej wydajne obliczeniowo, 
//wiêc klas wrapper u¿ywamy dopiero w razie potrzebe

//AUTOWRAPPING
//w javie od wersji 5 zmienne s¹ opakowywane (wrapped) automatycznie i automatycznie "rozpakowywane"
//tzn ¿e przed java 5 nie by³o autowrappingu
//poni¿ej przyk³ady praktyczne

public class AutoOp {
	public static void main(String[] args) {
		
		// czêœæ pierwsza
		System.out.println("CZÊŒÆ 1");	
		Integer liczba = 100; //bez new!
		Character znaczek = '8'; //bez new!
		Boolean log = Boolean.TRUE; //bez new!
		
		int i = liczba; //nie trzeba wywolywaæ metody klasy Integer!
		char z = znaczek; //nie trzeba wywo³ywaæ metody klasy Character!
		boolean l = log; //nie trzeba wywo³ywaæ metody klasy Boolean!
		
		System.out.println("Integer: " + i + "\nCharacter: " + z + "\nBoolean: " + l);
		
		
		// czêœæ druga
		System.out.println("\nCZÊŒÆ 2");		
		Integer liczba2 = sendInt(100);  //metoda przyjmuje Integer, da³em jej int, a mimo to automatycznie wrappuje
		Character znaczek2 = sendChar('x'); //metoda przyjmuje Character, da³em jej char, a mimo to automatycznie ogarnia temat
		System.out.println("liczba2: " + liczba2 + "\nznaczek2: " + znaczek2); //wszystko dzi¹³a jak nale¿y
		
		// czêœæ trzecia
		System.out.println("\nCZÊŒÆ 3"); //pokazuje, ¿e dzia³ania wykonywane na tych klasach s¹ wykonywane z autowrappingiem, 
		//java sama sobie rozpakowuje do typu prostego a potem znowu zapakowuje
		Integer o1,o2;
		int x;
		o1 = 36;
		o2 = o1/3;
		System.out.println("Wynik wyra¿enia o1/3: " + o2);
		++o2;
		System.out.println("Wynik wyra¿enia ++o2: " + o2);
		x = (o1/(o2-1))*23;
		System.out.println("(o1/(o2-1))*23 = " + x);
		
		
		// czêœæ czwarta
		System.out.println("\nCZÊŒÆ 4"); // wrapping dzia³a równie¿ przy instrukcjach steruj¹cych
		System.out.println("Poni¿ej wykorzystanie instrukcji if:");
		Boolean log2 = new Boolean(true);
		if (log2) System.out.println("true!");
		else System.out.println("false!");
		o1 = 2;
		System.out.println("Poni¿ej wykorzystanie switcha u¿ywaj¹c typu Integer jako parametru");
		switch (o1) {
			case 1: System.out.println("o1 = 1"); break;
			case 2: System.out.println("o1 = 2"); break;
			default: System.out.println("o1 inne ni¿ 1 i 2"); break;
		}
		
		// czêœæ pi¹ta - inny przyk³ad
		System.out.println("\nCZÊŒÆ 5");
		Integer object = 9999;
		int simple = object.byteValue();
		System.out.println(simple); //byte uciê³o ¿eby dopasowaæ do swojego zakresu, b³¹d
		System.out.println(object); //autowrapping sprawia ¿e wyeliminowany jest taki b³¹d
		
	}
		
	static int sendInt(Integer value) {
		return value;
	}
	
	static char sendChar(Character value) {
		return value;
	}
	
}
