package L9OperacjeWejsciaWyjscia;

import java.io.*;

//Klasa PrintWriter - zaleca siê jej stosowanie do wyœwietlania informacji

public class InOut2 {
	/*
	do tej pory do wyœwietlania danych z konsoli u¿ywaliœmy metody println 
	wywo³ywanej dla zmiennej referencyjnej System.out
	jest to jednak sposób wykorzystywany tylko przy testach, i choæ prawid³owy,
	to w praktyceu u¿ywamy innej klasy: PrintWriter
	PrintWriter u³atwia "umiêdzynarodowianie" aplikacji, co jest wa¿n¹ cech¹ tej klasy
	*/
	
	public static void main(String[] args) {
		PrintWriter p = new PrintWriter(System.out, true);
		//System.out - obiekt strumienia wyjœciowego
		//nasz obiekt bêdzie korzysta³ z kana³u wyjœciowego obiektu System.out
		//true - oznacza, ¿e java ma przesy³aæ dane po ka¿dym wywo³aniu metody println(), 
		//dla wartoœci true bêdzie to wykonywane automatycznie
		//jest to tylko jeden z kilku konstruktorów klasy PrintWriter

		p.println("Hello Guys");
		p.println(7);
		double x = 5.15;
		p.println(x);
		boolean b = true;
		p.println(b);
	}

}
