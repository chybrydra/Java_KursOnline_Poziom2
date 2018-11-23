package L2TypyWyliczenioweEnum2;
import L1TypyWyliczenioweEnum.Planety;


//UWAGA: typ wyliczeniowy nie mo¿e dziedziczyæ po innej klasie
//UWAGA2: wyliczenie nie mo¿e byæ klas¹ bazow¹
//czyli wyliczenia nie uczestnicz¹ w hierarchii klas
//przedstawione jest tutaj uzycie konstruktora i prostej metody typu wyliczeniowego Enum

public class Demo {

	public static void main(String[] args) {
		Planety2 planeta; //w tym momencie java wykona konstruktor dla ka¿dej z 9 sta³ych jakie s¹ w typie wyliczeniowym
		//dla typu wyliczeniowego nie uzywamy s³owa kluczowego "new", nie jest ono potrzebne
		
		System.out.println("Czas obiegu ziemi wokol slonca: " + Planety2.Ziemia.getOrbPeriod() + " ziemskich lat\n");
		
		System.out.println("Czas obiegu planet uk³adu s³onecznego wokol slonca liczone w ziemskich latach: ");
		
		for (Planety2 p : Planety2.values()) {
			System.out.println(p + ": " + p.getOrbPeriod());
		}
		
	}

}
