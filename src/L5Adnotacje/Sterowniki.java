package L5Adnotacje;

import java.lang.reflect.Method;

public class Sterowniki {
	
	private String login;
	private String password;
	
	@Adnotacja(login = "rootSterownikA", password = "passwordSterownikA")
	public void sterownikA(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public static void main(String[] args) {
		try {
			//w mainie b�dziemy chcieli pobra� adnotacje dla metody sterownikA
			
			//pobieranie obiektu reprezentuj�cego nasz� klas� sterowniki i przypisanie go do klasy Class
			Class<Sterowniki> c = Sterowniki.class; //pobieramy obiekt reprezentuj�cy nasz� klas� do zmiennej c
			
			//pobranie informacji na temat methody klasy sterownikA, musimy przekaza� jako obiekt metody class
			Method m = c.getMethod("sterownikA", String.class, String.class);
			
			//pobranie informacji o naszej adnotacji:
			Adnotacja adn = m.getAnnotation(Adnotacja.class);
			
			//wy�wietlenie informacji:
			System.out.println(adn.login() + " " + adn.password());
			
		} catch (NoSuchMethodException e) {
			System.out.println("Nie znaleziono metody.");
		}
	}
}
