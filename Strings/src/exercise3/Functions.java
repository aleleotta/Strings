package exercise3;
import java.util.*;

public class Functions {
	
	public static int checkBlanks(){
		String sentence;
		int blanks = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please introduce a sentence: ");
		sentence = sc.nextLine();
		for(int index = 0; index < sentence.length(); index++) {
			char character = sentence.charAt(index);
			if(character == ' ') {
				blanks++;
			}
		}
		System.out.println("There are " + blanks + " blanks.");
		sc.close();
		return blanks;
	}
}

/*Diseña una aplicación que pida al usuario que introduzca una frase por teclado
 *e indique cuántos espacios en blanco tiene.
 */