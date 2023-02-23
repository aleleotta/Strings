package exercise4;
import java.util.*;

public class Functions1 {
	
	public static void invertString() {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please introduce a sentence: ");
		input = sc.nextLine();
		for(int index = input.length()-1; index >= 0; index--) {
			System.out.print(input.charAt(index));
		}
		sc.close();
	}
}

/*Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
 *Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”. Recuerda probar la función en un main.
 */