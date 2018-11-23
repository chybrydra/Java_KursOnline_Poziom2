package L1TypyWyliczenioweEnum;

public class Demo {
	public static void main(String[] args) {
	
		// CZESC I - podstawowe wykorzystanie ENUM		
		System.out.println("CZESC I - podstawowe wykorzystanie ENUM\n");
		
		Planety planeta; //deklaracja zmiennej typu wyliczeniowego Planety
		planeta = Planety.Merkury; //zmiennej planeta mo¿emy przypisaæ tylko wartoœæ z typu wyliczeniowego Planety		
	
		System.out.println("Wartoœæ 'planeta' przed zmian¹: " + planeta +"\n");
		
		planeta = Planety.Saturn;
		
		System.out.println("Wartoœæ 'planeta' po zmianie: " + planeta + "\n");
		
		if (planeta == Planety.Ziemia) 
			System.out.println(planeta + " to nasz dom \n");
		else
			System.out.println(planeta + " nie jest najlepszym miejscem do zamieszkania przez ludzi.\n");		
		
		// w switchu nie muszê podawaæ "Planety.Merkury" itd., wystarczy samo 'Merkury", poniewa¿ typ wyliczeniowy
		//zosta³ wybrany ju¿ za pomoc¹ warunku w switchu (planeta jest typu Planety wiêc program ma jednoznacznie
		//podany typ wyliczeniowy
		switch (planeta) {
			case Merkury:
				System.out.println(planeta + " jest pierwsz¹ planet¹ od S³oñca"); 
				break;
			case Wenus:
				System.out.println(planeta + " jest drug¹ planet¹ od S³oñca"); 
				break;
			case Ziemia:
				System.out.println(planeta + " jest trzeci¹ planet¹ od S³oñca"); 
				break;
			case Mars:
				System.out.println(planeta + " jest czwart¹ planet¹ od S³oñca"); 
				break;
			default:
				System.out.println(planeta + " znajduje siê poza wewnêtrznym pasem asteroid"); 
				break;
		}
		
		// CZESC 2 - ENUM values()
		System.out.println("\n\nCZESC 2 - ENUM values()");
		Planety ukladSloneczny[] = Planety.values(); 
		// teraz tablica ukladSloneczny bedzie zawierac wszystkie wartosci wymienione w typie wyliczeniowym Planety
		System.out.println("Planety naszego ukladu slonecznego:");
		for (Planety p : ukladSloneczny) {
			System.out.println(p);
		}
		
		
		// CZESC 3 - ENUM valueOf()
		System.out.println("\n\nCZESC 3 - ENUM valueOf()");
		
		planeta = Planety.valueOf("Ziemia");
		System.out.println("Trzecia planeta od slonca to: " + planeta);
	}
	
}
