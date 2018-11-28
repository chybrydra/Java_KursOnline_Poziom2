package L9OperacjeWejsciaWyjscia;

import java.io.*;

public class KopiowaniePliku {
	
	public static void main(String[] args) {
		String load = ""; //przechowuje nazwe pliku podanej przez uzytkownika 
		String save = ""; //bedzie przechowywa� nazwe nowego pliku
		FileInputStream fin = null; //do otworzenia pliku
		FileOutputStream fout = null; //do zapisania pliku
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Prosz� o poda� nazw� pliku, kt�ry chcesz skopiowa�: ");
		try {
			load = "src/L9OperacjeWejsciaWyjscia/"+reader.readLine();
			fin = new FileInputStream(load);			
		} catch(FileNotFoundException e) {
			System.out.println("Brak pliku: "+ load + "\n" + e);
			System.exit(-1);
		} catch(IOException e) {
			System.out.println("B��d wej�cia/wyj�cia\n" + e);
		}
		
		System.out.println("Podaj nazwe dla nowego pliku: ");
		try {
			save = "src/L9OperacjeWejsciaWyjscia/"+reader.readLine();
			fout = new FileOutputStream(save);
		} catch(FileNotFoundException e) {
			System.out.println("Nie mo�na utworzy� pliku: "+ save + "\n" + e);
			System.exit(-1);
		} catch(IOException e) {
			System.out.println("B��d wej�cia/wyj�cia\n" + e);
		}
		
		//content czyta zawarto�� pliku tekstowego i t�umaczy� na strumienie znak�w
		BufferedReader content = new BufferedReader(new InputStreamReader(fin));
		DataOutputStream out = new DataOutputStream(fout);
		
		try {
			while ((load = content.readLine()) != null) {
				out.writeBytes(load+"\n");				
			}
			out.close();
			System.out.println("Kopiowanie zako�czone!");
		} catch (IOException e) {
			System.out.println("B��d przy przepisywaniu plik�w.\n" + e);
		}
	}
	
}
