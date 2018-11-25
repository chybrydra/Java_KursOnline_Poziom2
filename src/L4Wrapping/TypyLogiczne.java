package L4Wrapping;

// dwa konstruktory: Boolean(String lancuch), Boolean(boolean wartosclogiczna)
// sta³e: TRUE, FALSE, TYPE

public class TypyLogiczne {
	public static void main(String[] args) {
		Boolean log = new Boolean(true);
		Boolean log2 = new Boolean("FaLse");
		
		boolean l = log.booleanValue();
		
		System.out.println("Boolean(true): " + log + "\nBoolean(\"FaLse\"): " + log2 + "\nboolean: " + l + "\nBoolean.TRUE: " + Boolean.TRUE);
	}
}