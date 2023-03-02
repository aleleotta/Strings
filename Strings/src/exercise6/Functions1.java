package exercise6;
import java.util.*;

public class Functions1 {
	
	public static int wordCounterWithinString(String phrase, String word){
		int count = 0;
		int index = phrase.indexOf(word, 0);
		while(index >= 0) { //Use lengths.
			count++;
		}
		return count;
	}
}

/*Diseñar un programa que solicite al usuario una frase y una palabra.
 *A continuación buscará cuántas veces aparece la palabra en la frase.
 */