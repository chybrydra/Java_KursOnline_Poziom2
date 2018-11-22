package L1TypyWyliczenioweEnum;

public class Demo {
	public static void main(String[] args) {
	
		Planety planeta; //deklaracja zmiennej typu wyliczeniowego Planety
		planeta = Planety.Merkury; //zmiennej planeta mo�emy przypisa� tylko warto�� z typu wyliczeniowego Planety		
	
		System.out.println("Warto�� 'planeta' przed zmian�: " + planeta +"\n");
		
		planeta = Planety.Saturn;
		
		System.out.println("Warto�� 'planeta' po zmianie: " + planeta + "\n");
		
		if (planeta == Planety.Ziemia) 
			System.out.println(planeta + " to nasz dom \n");
		else
			System.out.println(planeta + " nie jest najlepszym miejscem do zamieszkania przez ludzi.\n");
		
		
		// w switchu nie musz� podawa� "Planety.Merkury" itd., wystarczy samo 'Merkury", poniewa� typ wyliczeniowy
		//zosta� wybrany ju� za pomoc� warunku w switchu (planeta jest typu Planety wi�c program ma jednoznacznie
		//podany typ wyliczeniowy
		switch (planeta) {
			case Merkury:
				System.out.println(planeta + " jest pierwsz� planet� od S�o�ca"); 
				break;
			case Wenus:
				System.out.println(planeta + " jest drug� planet� od S�o�ca"); 
				break;
			case Ziemia:
				System.out.println(planeta + " jest trzeci� planet� od S�o�ca"); 
				break;
			case Mars:
				System.out.println(planeta + " jest czwart� planet� od S�o�ca"); 
				break;
			default:
				System.out.println(planeta + " znajduje si� poza wewn�trznym pasem asteroid"); 
				break;
		}
	
	}
	
}
