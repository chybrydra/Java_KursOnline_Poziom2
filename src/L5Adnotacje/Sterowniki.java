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
			//w mainie bêdziemy chcieli pobraæ adnotacje dla metody sterownikA
			
			//pobieranie obiektu reprezentuj¹cego nasz¹ klasê sterowniki i przypisanie go do klasy Class
			Class<Sterowniki> c = Sterowniki.class; //pobieramy obiekt reprezentuj¹cy nasz¹ klasê do zmiennej c
			
			//pobranie informacji na temat methody klasy sterownikA, musimy przekazaæ jako obiekt metody class
			Method m = c.getMethod("sterownikA", String.class, String.class);
			
			//pobranie informacji o naszej adnotacji:
			Adnotacja adn = m.getAnnotation(Adnotacja.class);
			
			//wyœwietlenie informacji:
			System.out.println(adn.login() + " " + adn.password());
			
		} catch (NoSuchMethodException e) {
			System.out.println("Nie znaleziono metody.");
		}
	}
}
