package LAInneZagadnienia;

public class ModyfikatorStrict {
	/*przed bardzo star¹ wersj¹ javy 1.2 model obliczeñ zmiennoprzecinkowych
	mia³ restrykcyjn¹ formê (st¹d s³owo strict)
	wymaga³ on np. obcinania pewnych wartoœci poœrednich wystêpuj¹cych podczas obliczeñ
	na du¿ych liczbach
	zapobiega³o to w pewnych przypadkach przepe³nieniom i niedomiarom (niedope³nieniom)
	po wersji 1.2 mechanizm ten zniesiono i aby zmusiæ program do skorzystania z tego
	sposobu obliczeñ, nale¿y u¿yæ modyfikatora strictfp 
	modyfikator ten mo¿na umieœciæ przed deklaracj¹ metody, wtedy skorzystaj¹ z niego
	wszystkie metody w danej klasie, oraz mo¿na go umieœciæ przed konkretn¹ metod¹
	JEGO U¯YCIE JEST JEDNAK ZNIKOME
	*/
	
	public static void main(String[] args) {
		//jak pokazuj¹ poni¿sze przyk³ady, nie widaæ wyraznej ró¿nicy, 
		//a to dlatego, ¿e ró¿nica by³aby widoczna tylko w bardzo bardzo rzadkich sytuacjach
		//które sa prawie niespotykane
		//istnienie tego modyfikatora mo¿na wiêc potraktowaæ jako ciekawostkê i dodatkow¹ wiedzê z "historii" :)
		
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
