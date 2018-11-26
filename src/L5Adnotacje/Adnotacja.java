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
	//default "rootPassword" ustawia domyœln¹ wartoœæ adnotacji. 
	//Bêdzie ona wykorzystana, je¿eli nie nadamy adnotacji ¿adnych wartoœci.
	//default "rootUser" analogicznie - ustawia domyœln¹ wartoœæ adnotacji login()
}

/*
adnotacje nie mog¹ u¿ywaæ klauzuli extends
wzystkie adnotacje rozszerzaj¹ interfejs Annotation (robi¹ to automatycznie)
adnotacje sk³adaj¹ siê tylko z deklaracji metod, ale bez cia³ metod!
metody zachowuj¹ siê za to jak zmienne
 
Okreœlenie zachowania adnotacji:
Typ Wyliczeniowy: java.lang.annotation.RetentionPolicy
SOURCE - zachowanie tylko w pliku .java
CLASS - zachowanie równie¿ w pliku .class
RUNTIME - dostêpnoœæ dla JVM

Okreœlenie gdzie mo¿e byæ u¿yta metoda:
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
