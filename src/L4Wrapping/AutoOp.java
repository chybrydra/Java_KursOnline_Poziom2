package L4Wrapping;

//AUTOWRAPPING
//w javie od wersji 5 zmienne s� opakowywane (wrapped) automatycznie i automatycznie "rozpakowywane"
//poni�ej przyk�ady praktyczne

public class AutoOp {
	public static void main(String[] args) {
		
		// cz�� pierwsza
		System.out.println("CZʌ� 1");	
		Integer liczba = 100; //bez new!
		Character znaczek = '8'; //bez new!
		Boolean log = Boolean.TRUE; //bez new!
		
		int i = liczba; //nie trzeba wywolywa� metody klasy Integer!
		char z = znaczek; //nie trzeba wywo�ywa� metody klasy Character!
		boolean l = log; //nie trzeba wywo�ywa� metody klasy Boolean!
		
		System.out.println("Integer: " + i + "\nCharacter: " + z + "\nBoolean: " + l);
		
		
		// cz�� druga
		System.out.println("\nCZʌ� 2");		
		Integer liczba2 = sendInt(100);  //metoda przyjmuje Integer, da�em jej int, a mimo to automatycznie wrappuje
		Character znaczek2 = sendChar('x'); //metoda przyjmuje Character, da�em jej char, a mimo to automatycznie ogarnia temat
		System.out.println("liczba2: " + liczba2 + "\nznaczek2: " + znaczek2); //wszystko dzi��a jak nale�y
		
		// cz�� trzecia
		System.out.println("\nCZʌ� 3"); //pokazuje, �e dzia�ania wykonywane na tych klasach s� wykonywane z autowrappingiem, 
		//java sama sobie rozpakowuje do typu prostego a potem znowu zapakowuje
		Integer o1,o2;
		int x;
		o1 = 36;
		o2 = o1/3;
		System.out.println("Wynik wyra�enia o1/3: " + o2);
		++o2;
		System.out.println("Wynik wyra�enia ++o2: " + o2);
		x = (o1/(o2-1))*23;
		System.out.println("(o1/(o2-1))*23 = " + x);
		
	}
	
	static int sendInt(Integer value) {
		return value;
	}
	
	static char sendChar(Character value) {
		return value;
	}
	
}
