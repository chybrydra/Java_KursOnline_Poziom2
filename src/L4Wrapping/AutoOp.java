package L4Wrapping;

//w javie od wersji 5 zmienne s¹ opakowywane (wrapped) automatycznie i automatycznie "rozpakowywane"
//poni¿ej przyk³ady praktyczne

public class AutoOp {
	public static void main(String[] args) {
		Integer liczba = 100; //bez new!
		Character znaczek = '8'; //bez new!
		Boolean log = Boolean.TRUE; //bez new!
		
		int i = liczba; //nie trzeba wywolywaæ metody klasy Integer!
		char z = znaczek; //nie trzeba wywo³ywaæ metody klasy Character!
		boolean l = log; //nie trzeba wywo³ywaæ metody klasy Boolean!
		
		System.out.println("Integer: " + i + "\nCharacter: " + z + "\nBoolean: " + l);
	}
}
