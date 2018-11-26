package L6AdnotacjeZnacznikowe;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Adnotacje znacznikowe to wyj¹tkowe formy adnotacji nie posiadaj¹ce ¿adnych metod sk³adowych
//ich jedynym zadaniem jest znakowanie deklaracji

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Adnotacja {

}
