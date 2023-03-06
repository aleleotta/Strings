package exercise7;

public class Functions {
	
	public static boolean checkPalindrome(String phrase) {
		boolean check = false; //Setting check variable to false to begin with.
		int index1 = 0; //Index going forward.
		int index2 = phrase.length()-1; //Index going backwards.
		while(!(index1 > phrase.length()) && index2 > 0) { //while cycle which prevents indexes from going over limits.
			if(phrase.charAt(index1) != phrase.charAt(index2)) { //If statement that checks equality.
				break; //Break loop and keeps false check.
			}
			index1++; //Increment
			index2--; //Decrement
		}
		if(index1 == phrase.length()-1 && index2 == 0) {
			check = true;
		}
		return check;
	}
}

/*Realizar un programa que lea una frase del teclado y nos indique si es palíndroma,
 *es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda,
 *sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”.
 */