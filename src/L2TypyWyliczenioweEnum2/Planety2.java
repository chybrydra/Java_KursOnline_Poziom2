package L2TypyWyliczenioweEnum2;

//typy wyliczeniowe Enum r�wnie� mog� mie� konstruktory,
//mog� implementowa� interfejs itd.
//ka�da sta�a wyliczeniowa jest r�wnie� oddzielnym obiektem typu wyliczeniowego
//je�li zdefiniujemy konstruktor to b�dzie on wywo�ywany prze konstruowaniu ka�dej ze sta�ych wyliczeniowych
//czyli poni�ej konstruktor Planety(double op) b�dzie wywo�ywany za ka�dym razem przy tworzeniu kt�rejkolwiek sta�ej okre�lonej w Enumie

public enum Planety2 {
	Merkury(0.24), Wenus(0.62), Ziemia(1.00), Mars(1.88), Jowisz(11.86), Saturn(29.46), Uran(84.01), Neptun(164.80);
	
	private double orbitalPeriod;
	
	Planety2(double orbitalPeriod){
		this.orbitalPeriod = orbitalPeriod; //ka�da sta�a b�dzie mia�a swoj� kopi� zmiennej orbitalPeriod
	}
	
	double getOrbPeriod() {
		return orbitalPeriod;
	}
}
