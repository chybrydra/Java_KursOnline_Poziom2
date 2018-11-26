package L7AdnotacjeJednoelementowe;

import java.lang.reflect.Method;

//adnotacje jednoelementowe zawieraj� tylko jedn� sk�adow�
//dzia�aj� jak inne adnotacje, jedynie spos�b przypisywania warto�ci do tej jednej sk�adowej si� r�ni
//w nawiasie adnotacji u�ytej przy deklaracji wystarczy poda� sam� warto�� adnotacji, bez podawania nazwy 
//trzeba jednak u�y� sk�adowej o nazwie "value"
//mo�na u�ywa� tego r�wnie� dla wielu metod adnotacji, ale jest jeden warunek
//ta jedna metoda musi by� o nazwie "value", 
//a wszystkie pozosta�e metody z adnotacji musz� mie� ustawion� warto�� domy�ln�

public class Sterowniki {
	private String login;
	private String password;
	
	@Adnotacja("rootuser") //nie musia�em pisa� value = "rootuser", wystarczy�a sama warto��
	public void sterownikA(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public static void main(String[] args) {				
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