package L4Wrapping;

// kilka przyjemnych metod statycznych z klasy Character

public class TypyZnakowe2 {
	public static void main(String[] args) {
		
		char[] znaczek = {'x','y','9','!','G',' '};
		
		for (int i = 0; i < znaczek.length; i++) {
			
			if (Character.isDigit(znaczek[i])) System.out.println(znaczek[i] + " jest cyfr�");
			
			if (Character.isLetter(znaczek[i])) System.out.println(znaczek[i] + " jest liter�");
			
			if (Character.isWhitespace(znaczek[i])) System.out.println(znaczek[i] + " jest znakiem bia�ym");
			
			if (Character.isUpperCase(znaczek[i])) System.out.println(znaczek[i] + " jest wielk� liter�");
			
			if (Character.isLowerCase(znaczek[i])) System.out.println(znaczek[i] + " jest ma�� liter�");
		}
	}
}
