package exercise7;

public class Functions {
	
	public static boolean checkPalindrome(String phrase) {
		boolean check = false;
		int index1 = 0;
		int index2 = phrase.length()-1;
		while(!(index1 > phrase.length()) && index2 > 0) {
			if(phrase.charAt(index1) != phrase.charAt(index2)) {
				break;
			}
			index1++;
			index2--;
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