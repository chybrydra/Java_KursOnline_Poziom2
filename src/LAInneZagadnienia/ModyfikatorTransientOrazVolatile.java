package LAInneZagadnienia;

public class ModyfikatorTransientOrazVolatile {
	transient int a; //wartoœæ nie zostanie utrwalona przy zapisie obiektu na dysku
	int b; //wartoœæ b zostanie utrwalona przy zapisie obiektu na dysku
	
	volatile int c; /*ma za zadanie informowaæ kompilator, i¿ oznaczona nim zmienna 
	mo¿e zostaæ nieoczekiwanie zmieniona przez inn¹ czêœæ programu
	modyfikator ten stosuje siê przede wszystkim w srodowisku wielow¹tkowym
	gdzie kilka w¹tków mo¿e dzieliæ t¹ sam¹ sk³adow¹
	w takiej sytuacji ka¿dy w¹tek mo¿e przechowywaæ w³asn¹ kopiê wspó³dzielonej zmiennej, 
	co nie zawsze jest poprawne, i wtedy u¿ywamy modyfikatora volatile, który sprawia,
	¿e zmienna sk³adowa nieustannie bêdzie posiadaæ aktualn¹ wartoœæ, je¿eli bêdzie potrzeba
	to kompilator bêdzie uaktualnia³ równie¿ kopie zmiennej przechowywane przez w¹tki*/
} 
