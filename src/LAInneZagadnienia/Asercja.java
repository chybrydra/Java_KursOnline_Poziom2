package LAInneZagadnienia;

	//asercj� dodano do Javy w wersji 1.4
	//u�ywa si� jej do sprawdzania i testowania r�nych element�w aplikacji w procesie jej powstawania
	//tym elementem mo�e by� np. nasza matoda

	//uwaga - �eby java uwzgl�dni�a asercj� przy uruchomieniu, program trzeba uruchomi� troche inaczej:
	//normalne uruchomienie programu z konsoli Windows: java NazwaKlasy
	//uruchomienie z uwzgl�dnieniem asercji: java -ea NazwaKlasy
	//w programie eclipse trzeba ustawi� to w konfiguracji uruchomieniowej
	

	//�eby ustawi� dzi��anie asercji, czyli -ea przy uruchomieniu, to w Eclipse:
	//1. rozwijam liste przy zielonej strza�ce uruchamiaj�cej program
	//2. z listy wybieram "Run Configurations..."
	//3. wybieram obecny projekt i klas� w kt�rej uruchamiam (to si� zrobi w sumie automatycznie, wi�c...)
	//4. przechodz� do zak�adaki "Arguments"
	//5. w polu VM Arguments wpisuj� "-ea" bez cudzys�owi�w
	//6. dzia�a

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
