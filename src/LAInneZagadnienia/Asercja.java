package LAInneZagadnienia;

	//asercjê dodano do Javy w wersji 1.4
	//u¿ywa siê jej do sprawdzania i testowania ró¿nych elementów aplikacji w procesie jej powstawania
	//tym elementem mo¿e byæ np. nasza matoda

	//uwaga - ¿eby java uwzglêdni³a asercjê przy uruchomieniu, program trzeba uruchomiæ troche inaczej:
	//normalne uruchomienie programu z konsoli Windows: java NazwaKlasy
	//uruchomienie z uwzglêdnieniem asercji: java -ea NazwaKlasy
	//w programie eclipse trzeba ustawiæ to w konfiguracji uruchomieniowej
	

	//¿eby ustawiæ dzi¹³anie asercji, czyli -ea przy uruchomieniu, to w Eclipse:
	//1. rozwijam liste przy zielonej strza³ce uruchamiaj¹cej program
	//2. z listy wybieram "Run Configurations..."
	//3. wybieram obecny projekt i klasê w której uruchamiam (to siê zrobi w sumie automatycznie, wiêc...)
	//4. przechodzê do zak³adaki "Arguments"
	//5. w polu VM Arguments wpisujê "-ea" bez cudzys³owiów
	//6. dzia³a

public class Asercja {
	
	static int val = 3;
	
	static int getNum() {
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		for (int i=0; i<10; i++) {
			n=getNum();
			assert n > 0;
			System.out.println("n wynosi: " + n);
		}
	}
	
}
