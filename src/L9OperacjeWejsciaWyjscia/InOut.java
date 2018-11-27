package L9OperacjeWejsciaWyjscia;

import java.io.*;

public class InOut {
	
	//BufferedReader
	/* TEORIA:
	odczyt danych z konsoli
	jedn¹ z podstawowych funkcji jakie zapewnia nam javowe IO 
	 jest obs³uga zdarzeñ systemowej konsoli
	w javie odbywa siê to za pomoc¹ predefiniowanej zmiennej klasy System o nazwie "in" (System.in)
	sk³adowa System.in to standartowy strumieñ wejœciowy, którym domyœlnie jest klawiatura
	aby odczytaæ strumieñ znaków z konsuli, obiekt System.in trzeba najpierw opakowaæ obiektem InputStreamReader
	klasa ta przekonwertuje pobrane z konsoli bajty na pojedyncze znaki
	ca³oœæ wyra¿enia trzeba umieœciæ w parametrze klasy BufferedReader który po³¹czy znaki w strumieñ znaków
	*/
	
	public static void main(String[] args) {
		
		int x,y,z; //liczby, które bêdziemy pobieraæ od u¿ytkownika z konsoli
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//System.in pobiera dane z konsoli w postaci bajtów
		//klasa InputStreamReader t³umaczy te bajty na znaki
		//klasa BufferedReader sk³ada te znaki w strumieñ znaków
		
		try { 
			System.out.print("Podaj x: ");
			x = Integer.parseInt(reader.readLine());
			System.out.print("Podaj y: ");
			y = Integer.parseInt(reader.readLine());
			z=x+y;		
			System.out.println("x + y = " + z);
		} catch (IOException e) {
			System.out.println("B³¹d InOut!\n" + e);
		} catch (NumberFormatException e) {
			System.out.println("Podano niepoprawn¹ wartoœæ!\n" + e);
		}
	}	
}
