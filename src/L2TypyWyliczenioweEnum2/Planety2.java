package L2TypyWyliczenioweEnum2;

//typy wyliczeniowe Enum równie¿ mog¹ mieæ konstruktory,
//mog¹ implementowaæ interfejs itd.
//ka¿da sta³a wyliczeniowa jest równie¿ oddzielnym obiektem typu wyliczeniowego
//jeœli zdefiniujemy konstruktor to bêdzie on wywo³ywany prze konstruowaniu ka¿dej ze sta³ych wyliczeniowych
//czyli poni¿ej konstruktor Planety(double op) bêdzie wywo³ywany za ka¿dym razem przy tworzeniu którejkolwiek sta³ej okreœlonej w Enumie

public enum Planety2 {
	Merkury(0.24), Wenus(0.62), Ziemia(1.00), Mars(1.88), Jowisz(11.86), Saturn(29.46), Uran(84.01), Neptun(164.80);
	
	private double orbitalPeriod;
	
	Planety2(double orbitalPeriod){
		this.orbitalPeriod = orbitalPeriod; //ka¿da sta³a bêdzie mia³a swoj¹ kopiê zmiennej orbitalPeriod
	}
	
	double getOrbPeriod() {
		return orbitalPeriod;
	}
}
