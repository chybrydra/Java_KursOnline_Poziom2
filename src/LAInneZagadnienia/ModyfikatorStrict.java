package LAInneZagadnienia;

public class ModyfikatorStrict {
	/*przed bardzo star� wersj� javy 1.2 model oblicze� zmiennoprzecinkowych
	mia� restrykcyjn� form� (st�d s�owo strict)
	wymaga� on np. obcinania pewnych warto�ci po�rednich wyst�puj�cych podczas oblicze�
	na du�ych liczbach
	zapobiega�o to w pewnych przypadkach przepe�nieniom i niedomiarom (niedope�nieniom)
	po wersji 1.2 mechanizm ten zniesiono i aby zmusi� program do skorzystania z tego
	sposobu oblicze�, nale�y u�y� modyfikatora strictfp 
	modyfikator ten mo�na umie�ci� przed deklaracj� metody, wtedy skorzystaj� z niego
	wszystkie metody w danej klasie, oraz mo�na go umie�ci� przed konkretn� metod�
	JEGO U�YCIE JEST JEDNAK ZNIKOME
	*/
	
	public static void main(String[] args) {
		//jak pokazuj� poni�sze przyk�ady, nie wida� wyraznej r�nicy, 
		//a to dlatego, �e r�nica by�aby widoczna tylko w bardzo bardzo rzadkich sytuacjach
		//kt�re sa prawie niespotykane
		//istnienie tego modyfikatora mo�na wi�c potraktowa� jako ciekawostk� i dodatkow� wiedz� z "historii" :)
		
		ModyfikatorStrict[] testy = {new ModyfikatorStrict(6666.0, 9999.0),
									 new ModyfikatorStrict(123.15136, 12.5),
									 new ModyfikatorStrict(1332.12, 124.216237437)};
		for(int i=0; i<testy.length; i++) {
			System.out.println(testy[i].getX() + "," + testy[i].getY());
			System.out.println(testy[i].calculate());
			System.out.println(testy[i].calculate2());
			System.out.println();
		}
	}
	
	private double x,y;
	ModyfikatorStrict(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	strictfp double calculate() {
		return x*y;
	}
	
	double calculate2() {
		return x*y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
