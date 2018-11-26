package L6AdnotacjeZnacznikowe;

import java.lang.reflect.Method;
//w tym �wiczeniu sprawdzimy, czy nasza adnotacja zosta�a u�yta dla metody sterownikA
public class Sterowniki {
	private String login;
	private String password;
	
	@Adnotacja()
	public void sterownikA(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public static void main(String[] args) {		
		//chcemy otrzyma� informacj�, czy nasza adnotacja zosta�a wykorzystana przy metodzie sterownikA
		//skorzystamy w tym celu z metody isAnnotationPresent() zwracaj�cej typ boolean
		
		Sterowniki s = new Sterowniki();
		
		try {
			Method m = s.getClass().getMethod("sterownikA", String.class, String.class);
			if (m.isAnnotationPresent(Adnotacja.class)) {
				System.out.println("Nasza adnotacja istnieje dla metody sterownikA");
			}
		} catch (NoSuchMethodException e) {
			System.out.println("Nie znaleziono metody!\n"+e);
		}
	}
}
