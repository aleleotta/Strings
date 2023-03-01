package exercise5;
import java.util.*;

public class Functions {
	
	public static void concatenate() {
		String string1 = ""; //Variables declared.
		String string2 = "";
		String fusion = "";
		Scanner sc = new Scanner(System.in); //Scanner declaration
		System.out.print("Introduce the first substring: "); //First substring input
		string1 = sc.next();
		System.out.print("Introduce the second substring: "); //Second substring input
		string2 = sc.next();
		fusion = string1 + " " + string2; //Both substrings fuse together to make new string.
		while(!string2.equalsIgnoreCase("end") && !string2.equalsIgnoreCase("fin")) { //While the second string is not equal to end or fin ignoring the case the program will keep asking for another input for string2.
			System.out.print("Introduce another substring: ");
			string2 = sc.next();
			if(!string2.equalsIgnoreCase("end") && !string2.equalsIgnoreCase("fin")) { //If statement prevents "end" or "fin" from being included in the final string.
				fusion = fusion + " " + string2; //Concatenation of the next substring into string.
			}
		}
		System.out.println(fusion); //Final string shown.
		sc.close(); //Scanner closes.
	}
}

/*Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando
 *las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando
 *alguna de las palabras introducidas sea la cadena “fin” escrita con cualquier combinación
 *de mayúsculas/minúsculas. La cadena “fin” no aparecerá en la frase final.
 */