package exercise6;
import java.util.*;

public class Functions {
	
	public static int wordCounterWithinString(String phrase, String word){
		int count = 0;
		for(int index = 0; index < phrase.length(); index++) {
			if(index == phrase.indexOf(word, index)) {
				count++;
			}
		}
		return count;
	}
}

/*Diseñar un programa que solicite al usuario una frase y una palabra.
 *A continuación buscará cuántas veces aparece la palabra en la frase.
 */