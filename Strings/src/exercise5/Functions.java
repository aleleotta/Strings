package exercise5;
import java.util.*;

public class Functions {
	
	public static void concatenate() {
		String string1 = "";
		String string2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce the first substring: ");
		string1 = sc.next();
		System.out.print("Introduce another substring: ");
		string2 = sc.next();
		while(!string2.equalsIgnoreCase("end") || !string2.equalsIgnoreCase("fin")) {}
		sc.close();
	}
}

/*Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando
 *las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando
 *alguna de las palabras introducidas sea la cadena “fin” escrita con cualquier combinación
 *de mayúsculas/minúsculas. La cadena “fin” no aparecerá en la frase final.
 */