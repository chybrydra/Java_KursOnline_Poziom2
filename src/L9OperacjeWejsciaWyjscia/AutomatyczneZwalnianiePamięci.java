package L9OperacjeWejsciaWyjscia;

import java.io.*;

public class AutomatyczneZwalnianiePamiêci {	
	
	public static void main(String[] args) {
		
		//od wersji Javy 1.8 wprowadzono automatyczne zwalnianie pamiêci (zamykanie niepotrzebnych strumieni)
		//w celu unikniêcia zajmowania przez nieu¿ywane strumienie pamiêci
		//w zwi¹zku z tym powsta³o nowe u¿ycie bloku try (przedstawione poni¿ej)
		//s¹ wci¹¿ jednak sytuacje, gdzie wskazane jest jawne zamkniêcie strumienia metod¹ close()
		
		String line = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wpisz tekst: ");
		//nowy sposób zapisu, zalecany od wersji java 1.8 -> strumieñ otwieramy w nawiasach przy instrukcji "try"
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
