package L4Wrapping;

// kilka przyjemnych metod statycznych z klasy Character

public class TypyZnakowe2 {
	public static void main(String[] args) {
		
		char[] znaczek = {'x','y','9','!','G',' '};
		
		for (int i = 0; i < znaczek.length; i++) {
			
			if (Character.isDigit(znaczek[i])) System.out.println(znaczek[i] + " jest cyfr¹");
			
			if (Character.isLetter(znaczek[i])) System.out.println(znaczek[i] + " jest liter¹");
			
			if (Character.isWhitespace(znaczek[i])) System.out.println(znaczek[i] + " jest znakiem bia³ym");
			
			if (Character.isUpperCase(znaczek[i])) System.out.println(znaczek[i] + " jest wielk¹ liter¹");
			
			if (Character.isLowerCase(znaczek[i])) System.out.println(znaczek[i] + " jest ma³¹ liter¹");
		}
	}
}
