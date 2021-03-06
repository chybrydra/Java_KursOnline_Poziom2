package L6AdnotacjeZnacznikowe;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Adnotacje znacznikowe to wyjątkowe formy adnotacji nie posiadające żadnych metod składowych
//ich jedynym zadaniem jest znakowanie deklaracji

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Adnotacja {

}
