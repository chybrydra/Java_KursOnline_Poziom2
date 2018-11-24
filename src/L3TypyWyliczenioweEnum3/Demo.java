package L3TypyWyliczenioweEnum3;

import L1TypyWyliczenioweEnum.Planety;

//typy wyliczeniowe dziedzicz¹ z klasy Enum i mo¿emy wykorzystaæ kilka przydatnych metod z tej klasy

public class Demo {

	public static void main(String[] args) {
		Planety3 p1, p2, p3;
		
		//metoda ordinal() klasy Enum zwraca pozycje obiektu w wyliczeniu
		System.out.println("==== Metoda ordinal() =====");
		for (Planety p : Planety.values()) {
			System.out.println(p + ": " + p.ordinal());
		}
		
		//metoda compareTo() 
		System.out.println("\n==== Metoda compareTo() =====");
		p1=Planety3.Neptun;
		p2=Planety3.Wenus;
		p3=Planety3.Neptun;
		System.out.println("Wywo³anie metody p2.compareTo(p1): " + p2.compareTo(p1));
				
		if (p1.compareTo(p3) == 0) {
			System.out.println(p1 + " znajduje sie w takiej samej odleg³oœci od s³oñca, jak " + p3);
		} else {
			System.out.println(p1 + "nie znajduje siê w takiej smaej odleg³oœci od s³oñca, jak " + p3);
		}
		
		//metoda equals() 
		System.out.println("\n==== Metoda equals() =====");
		if (p1.equals(p3)) {
			System.out.println("OK, it is equal");
		} else {
			System.out.println("not equal");
		}

	}

}
