package L9OperacjeWejsciaWyjscia;

import java.io.*;

//Klasa PrintWriter - zaleca si� jej stosowanie do wy�wietlania informacji

public class InOut2 {
	/*
	do tej pory do wy�wietlania danych z konsoli u�ywali�my metody println 
	wywo�ywanej dla zmiennej referencyjnej System.out
	jest to jednak spos�b wykorzystywany tylko przy testach, i cho� prawid�owy,
	to w praktyceu u�ywamy innej klasy: PrintWriter
	PrintWriter u�atwia "umi�dzynarodowianie" aplikacji, co jest wa�n� cech� tej klasy
	*/
	
	public static void main(String[] args) {
		PrintWriter p = new PrintWriter(System.out, true);
		//System.out - obiekt strumienia wyj�ciowego
		//nasz obiekt b�dzie korzysta� z kana�u wyj�ciowego obiektu System.out
		//true - oznacza, �e java ma przesy�a� dane po ka�dym wywo�aniu metody println(), 
		//dla warto�ci true b�dzie to wykonywane automatycznie
		//jest to tylko jeden z kilku konstruktor�w klasy PrintWriter

		p.println("Hello Guys");
		p.println(7);
		double x = 5.15;
		p.println(x);
		boolean b = true;
		p.println(b);
	}

}
