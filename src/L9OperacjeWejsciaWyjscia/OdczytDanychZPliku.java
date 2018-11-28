package L9OperacjeWejsciaWyjscia;

import java.io.*;

public class OdczytDanychZPliku {
	//skorzystam tutaj z klasy FileInputStream
	
	public static void main(String[] args) {
		String line = "";
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/L9OperacjeWejsciaWyjscia/plik.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!\n" + e);
			System.exit(-1);
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
		//tutaj u¿ywamy obiektu fin zamiast System.in
		
		try {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("B³¹d wejœcia/wyjœcia \n" + e);
		}
		
		try {
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
