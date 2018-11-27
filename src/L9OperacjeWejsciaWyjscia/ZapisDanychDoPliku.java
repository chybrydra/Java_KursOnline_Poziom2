package L9OperacjeWejsciaWyjscia;

import java.io.*;

//program pobiera dane od u�ytkownika a� do momentu wpisania przez u�ytkownika s�owa "quit"
//po wpisaniu s�owa "quit" program ko�czy dzia�anie i zapisuje podane przez u�ytkownika dane do pliku plik.txt
//plik.txt zapisuje si� w pakiecie L9OperacjeWejsciaWyjscia

public class ZapisDanychDoPliku {

	/*Do zapisu/odczytu danych w/z pliku najcz�ciej stosuje si� klasy strumienia bajtowego
	FileOutputStream/FileInputStream
	klasa FileOutputStream tworzy egzemplarz klasy OutputStream, 
	za pomoc� kt�rego mo�emy zapisywa� bajty danych do pliku
	klasa ta posiada kilka r�nych konstruktor�w, w tym jednoargumentowy (�cie�ka do pliku)
	*/
	
	public static void main(String[] args) {
		String line = "";
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/L9OperacjeWejsciaWyjscia/plik.txt"); 
			//je�li plik nie istnieje, zostanie utworzony, je�li istnieje to zostanie nadpisany
		} catch (FileNotFoundException e) {
			System.out.println("B��d przy utworzeniu pliku!\n" + e);
		}
		
		//DataOutputStream umo�liwi zapisywanie pobranych z konsoli znak�w do pliku
		DataOutputStream out = new DataOutputStream(fout);  
		//i oczywi�cie obiekt do pobierania danych od u�ytkownika
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Wprowadz w konsoli przyk�adowy tekst. \nAby zako�czy� wpisz 'quit' i naci�nij ENTER.");
		
		try {
			while (true) {
				line = reader.readLine();
				if ("quit".equals(line)) {
					out.close(); break;
				}
				out.writeBytes(line + '\n'); //zapisze wprowadzone przez nas dane do pliku txt
				//plik zapisuje si� domy�lnie w g��wnym folderze projektu, je�eli nie podamy �cie�ki
				//ja ustawi�em �cie�k� tak, �eby zapisa� si� w pakiecie L9OperacjeWyjsciaWejscia
			}
			System.out.println("Koniec programu");
		} catch (IOException e) {
			System.out.println("B��d Wej�cia/Wyj�cia.\n" + e);
		}
	}
	
}
