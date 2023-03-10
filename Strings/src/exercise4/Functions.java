package exercise4;
import java.util.*;

public class Functions {

	public static void invertString() {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please introduce a sentence: ");
		input = sc.nextLine();
		for(int index = input.length()-1; index >= 0; index--) {
			char reverse = input.charAt(index);
			String reverseString = input.substring(index, index+1);
			System.out.print(reverseString);
		}
		sc.close();
	}
}

/*Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
 *Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”. Recuerda probar la función en un main.
 */