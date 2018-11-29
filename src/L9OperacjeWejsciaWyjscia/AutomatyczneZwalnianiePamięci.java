package L9OperacjeWejsciaWyjscia;

import java.io.*;

public class AutomatyczneZwalnianiePami�ci {	
	
	public static void main(String[] args) {
		
		//od wersji Javy 1.8 wprowadzono automatyczne zwalnianie pami�ci (zamykanie niepotrzebnych strumieni)
		//w celu unikni�cia zajmowania przez nieu�ywane strumienie pami�ci
		//w zwi�zku z tym powsta�o nowe u�ycie bloku try (przedstawione poni�ej)
		//s� wci�� jednak sytuacje, gdzie wskazane jest jawne zamkni�cie strumienia metod� close()
		
		String line = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wpisz tekst: ");
		//nowy spos�b zapisu, zalecany od wersji java 1.8 -> strumie� otwieramy w nawiasach przy instrukcji "try"
		try (FileOutputStream fout = new FileOutputStream("src/L9OperacjeWejsciaWyjscia/lekcjaAutomatyczneZwalnianie.txt")){
			DataOutputStream out = new DataOutputStream(fout);
			while(true) {
				line = reader.readLine();
				if ("quit".equals(line)) {
					break;
				}
				out.writeBytes(line + "\n");
			}
			System.out.println("Koniec zapisu.");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
