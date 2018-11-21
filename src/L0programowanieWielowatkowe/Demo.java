package L0programowanieWielowatkowe;

public class Demo {

	public static void main(String[] args) {


		NowyWatek w1 = new NowyWatek("Jeden");
		NowyWatek w2 = new NowyWatek("Dwaaa");

		try {
			//na poczatek usypiamy watek glowny na 4s
			Thread.sleep(4000);
			//przez ten czas watki dodatkowe obiegna swoje petle 5 razy "ramie w ramie", odlicza od 15 do 11

			//nastepnie usypiam watek w1:
			w1.uspij();
			System.out.println("Zawieszenie watku Jeden");			
			Thread.sleep(4000);
			
			
			//przez ten czas watek 2 odliczyl od 10 do 6
			//budze od nowa watek 1, i od razu usypiam watek 2
			w1.obudz();
			System.out.println("Wznowienie watku Jeden");
			w2.uspij();
			System.out.println("Zawieszenie watku Dwaaa");			
			Thread.sleep(4000);
			
			//po tym jak watek 1 dogonil watek 2 z odliczaniem, budze watek 2 i znowu odliczaja razem do zera
			w2.obudz();
			System.out.println("Wznowienie watku Dwaaa");
			
		} catch (InterruptedException e) {
			System.err.println("Przerwanie watku glownego\n"+e);
		}
		
		try {
			System.out.println("Oczekiwanie na zakonczenie dodatkowych watkow");
			//korzystamy z metody join by watek glowny poczekal az watki w1 i w2 zakoncza swoja prace
			//nie chcemy zeby watek glowny zakonczyl sie wczesniej
			w1.t.join();
			w2.t.join();
		} catch(InterruptedException e) {
			System.err.println("Przerwanie watku glownego\n"+e);
		}
		System.out.println("Koniec watku glownego");
	}

}


/*
join() - z metody tej korzystamy, zeby watek glowny nie zakonczyl nie daj boze swojej pracy przed watkami pobocznymi
InterruptedException - jest to wyjatek powiazany z metoda sleep() klasy Thread

*/