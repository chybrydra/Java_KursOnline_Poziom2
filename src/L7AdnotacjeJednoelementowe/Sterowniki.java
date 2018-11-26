package L7AdnotacjeJednoelementowe;

import java.lang.reflect.Method;

//adnotacje jednoelementowe zawieraj¹ tylko jedn¹ sk³adow¹
//dzia³aj¹ jak inne adnotacje, jedynie sposób przypisywania wartoœci do tej jednej sk³adowej siê ró¿ni
//w nawiasie adnotacji u¿ytej przy deklaracji wystarczy podaæ sam¹ wartoœæ adnotacji, bez podawania nazwy 
//trzeba jednak u¿yæ sk³adowej o nazwie "value"
//mo¿na u¿ywaæ tego równie¿ dla wielu metod adnotacji, ale jest jeden warunek
//ta jedna metoda musi byæ o nazwie "value", 
//a wszystkie pozosta³e metody z adnotacji musz¹ mieæ ustawion¹ wartoœæ domyœln¹

public class Sterowniki {
	private String login;
	private String password;
	
	@Adnotacja("rootuser") //nie musia³em pisaæ value = "rootuser", wystarczy³a sama wartoœæ
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