package exercise7;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String phrase = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a phrase:");
		phrase = sc.nextLine();
		System.out.println("\n" + "Is the phrase palindrome?\n\n" + Functions.checkPalindrome(phrase));
		sc.close();
	}
}

/*Realizar un programa que lea una frase del teclado y nos indique si es palíndroma,
 *es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda,
 *sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”.
 */