package exercise6;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String phrase = "";
		String word = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a phrase:");
		phrase = sc.nextLine();
		System.out.println("Type in a word to count within the phrase:");
		word = sc.next();
		System.out.println("The word \"" + word + "\" appears " + Functions.wordCounterWithinString(phrase, word) + " times.");
		sc.close();
	}
}

/*Diseñar un programa que solicite al usuario una frase y una palabra.
 *A continuación buscará cuántas veces aparece la palabra en la frase.
 */