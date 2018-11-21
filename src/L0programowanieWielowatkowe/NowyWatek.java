package L0programowanieWielowatkowe;

public class NowyWatek implements Runnable {
	
	String nazwa; //pojemnik na nazwe watku
	Thread t; //watek
	boolean flaga; //do sterowania watkiem
	
	public NowyWatek(String nazwaWatku){
		nazwa = nazwaWatku;
		t = new Thread(this, nazwa); //tworzenie nowego watku
		System.out.println("Nowy watek: " + t);
		flaga = false; // gdy flaga przyjmie wartosc true, to watek zostaje uspiony (definiuja to ponizsze klasy)		
		t.start(); //zainicjalizowanie watku, sam sie nie wywola przeciez
	}
	
	//nasz watek bedzie odliczal od 15 do 0 co 800ms
	public void run() {
		try {
			for (int i = 15; i>=0; i--) {
				System.out.println(nazwa + ":" + i);
				Thread.sleep(800);
				synchronized (this) {
					while (flaga) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.err.println(nazwa + " zostal przerwany\n"+e);
		}
		System.out.println("Wyjscie z watku " + nazwa);
	}
	
	synchronized void uspij() {
		flaga = true;
	}
	
	synchronized void obudz() {
		flaga = false;
		notify(); // zeby "powiadomic" o obudzeniu watku
	}
	
}
