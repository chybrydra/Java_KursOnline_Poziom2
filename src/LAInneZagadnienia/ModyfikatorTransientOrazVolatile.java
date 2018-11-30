package LAInneZagadnienia;

public class ModyfikatorTransientOrazVolatile {
	transient int a; //warto�� nie zostanie utrwalona przy zapisie obiektu na dysku
	int b; //warto�� b zostanie utrwalona przy zapisie obiektu na dysku
	
	volatile int c; /*ma za zadanie informowa� kompilator, i� oznaczona nim zmienna 
	mo�e zosta� nieoczekiwanie zmieniona przez inn� cz�� programu
	modyfikator ten stosuje si� przede wszystkim w srodowisku wielow�tkowym
	gdzie kilka w�tk�w mo�e dzieli� t� sam� sk�adow�
	w takiej sytuacji ka�dy w�tek mo�e przechowywa� w�asn� kopi� wsp�dzielonej zmiennej, 
	co nie zawsze jest poprawne, i wtedy u�ywamy modyfikatora volatile, kt�ry sprawia,
	�e zmienna sk�adowa nieustannie b�dzie posiada� aktualn� warto��, je�eli b�dzie potrzeba
	to kompilator b�dzie uaktualnia� r�wnie� kopie zmiennej przechowywane przez w�tki*/
} 
