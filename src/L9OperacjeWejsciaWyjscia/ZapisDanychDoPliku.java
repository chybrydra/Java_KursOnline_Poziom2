package L9OperacjeWejsciaWyjscia;

import java.io.*;

//program pobiera dane od u¿ytkownika a¿ do momentu wpisania przez u¿ytkownika s³owa "quit"
//po wpisaniu s³owa "quit" program koñczy dzia³anie i zapisuje podane przez u¿ytkownika dane do pliku plik.txt
//plik.txt zapisuje siê w pakiecie L9OperacjeWejsciaWyjscia

public class ZapisDanychDoPliku {

	/*Do zapisu/odczytu danych w/z pliku najczêœciej stosuje siê klasy strumienia bajtowego
	FileOutputStream/FileInputStream
	klasa FileOutputStream tworzy egzemplarz klasy OutputStream, 
	za pomoc¹ którego mo¿emy zapisywaæ bajty danych do pliku
	klasa ta posiada kilka ró¿nych konstruktorów, w tym jednoargumentowy (œcie¿ka do pliku)
	*/
	
	public static void main(String[] args) {
		String line = "";
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/L9OperacjeWejsciaWyjscia/plik.txt"); 
			//jeœli plik nie istnieje, zostanie utworzony, jeœli istnieje to zostanie nadpisany
		} catch (FileNotFoundException e) {
			System.out.println("B³¹d przy utworzeniu pliku!\n" + e);
		}
		
		//DataOutputStream umo¿liwi zapisywanie pobranych z konsoli znaków do pliku
		DataOutputStream out = new DataOutputStream(fout);  
		//i oczywiœcie obiekt do pobierania danych od u¿ytkownika
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Wprowadz w konsoli przyk³adowy tekst. \nAby zakoñczyæ wpisz 'quit' i naciœnij ENTER.");
		
		try {
			while (true) {
				line = reader.readLine();
				if ("quit".equals(line)) {
					out.close(); break;
				}
				out.writeBytes(line + '\n'); //zapisze wprowadzone przez nas dane do pliku txt
				//plik zapisuje siê domyœlnie w g³ównym folderze projektu, je¿eli nie podamy œcie¿ki
				//ja ustawi³em œcie¿kê tak, ¿eby zapisa³ siê w pakiecie L9OperacjeWyjsciaWejscia
			}
			System.out.println("Koniec programu");
		} catch (IOException e) {
			System.out.println("B³¹d Wejœcia/Wyjœcia.\n" + e);
		}
	}
	
}
