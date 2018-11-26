package L5Adnotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) //strategia zachowania adnotacji
public @interface Adnotacja {
	String login() default "rootUser";
	String password() default "rootPassword"; 
	//default "rootPassword" ustawia domy�ln� warto�� adnotacji. 
	//B�dzie ona wykorzystana, je�eli nie nadamy adnotacji �adnych warto�ci.
	//default "rootUser" analogicznie - ustawia domy�ln� warto�� adnotacji login()
}

/*
adnotacje nie mog� u�ywa� klauzuli extends
wzystkie adnotacje rozszerzaj� interfejs Annotation (robi� to automatycznie)
adnotacje sk�adaj� si� tylko z deklaracji metod, ale bez cia� metod!
metody zachowuj� si� za to jak zmienne
 
Okre�lenie zachowania adnotacji:
Typ Wyliczeniowy: java.lang.annotation.RetentionPolicy
SOURCE - zachowanie tylko w pliku .java
CLASS - zachowanie r�wnie� w pliku .class
RUNTIME - dost�pno�� dla JVM

Okre�lenie gdzie mo�e by� u�yta metoda:
Typ wyliczeniowy: java.lang.annotation.ElementType
ANNOTATION_TYPE - inna adnotacja
CONSTRUCTOR - konstruktor
FIELD - pole
LOCAL_VARIABLE - zmienna lokalna
METHOD - metoda
PACKAGE - pakiet
PARAMETER - parametr
TYPE - klasa/interfejs/wyliczenie
*/
