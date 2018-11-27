package L9OperacjeWejsciaWyjscia;

import java.io.*;

public class InOut {
	
	//BufferedReader
	/* TEORIA:
	odczyt danych z konsoli
	jedn� z podstawowych funkcji jakie zapewnia nam javowe IO 
	 jest obs�uga zdarze� systemowej konsoli
	w javie odbywa si� to za pomoc� predefiniowanej zmiennej klasy System o nazwie "in" (System.in)
	sk�adowa System.in to standartowy strumie� wej�ciowy, kt�rym domy�lnie jest klawiatura
	aby odczyta� strumie� znak�w z konsuli, obiekt System.in trzeba najpierw opakowa� obiektem InputStreamReader
	klasa ta przekonwertuje pobrane z konsoli bajty na pojedyncze znaki
	ca�o�� wyra�enia trzeba umie�ci� w parametrze klasy BufferedReader kt�ry po��czy znaki w strumie� znak�w
	*/
	
	public static void main(String[] args) {
		
		int x,y,z; //liczby, kt�re b�dziemy pobiera� od u�ytkownika z konsoli
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//System.in pobiera dane z konsoli w postaci bajt�w
		//klasa InputStreamReader t�umaczy te bajty na znaki
		//klasa BufferedReader sk�ada te znaki w strumie� znak�w
		
		try { 
			System.out.print("Podaj x: ");
			x = Integer.parseInt(reader.readLine());
			System.out.print("Podaj y: ");
			y = Integer.parseInt(reader.readLine());
			z=x+y;		
			System.out.println("x + y = " + z);
		} catch (IOException e) {
			System.out.println("B��d InOut!\n" + e);
		} catch (NumberFormatException e) {
			System.out.println("Podano niepoprawn� warto��!\n" + e);
		}
	}	
}
