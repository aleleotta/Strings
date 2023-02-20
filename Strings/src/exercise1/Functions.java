package exercise1;
import java.util.*;

public class Functions {
	
	public static void shorterString() {
		Scanner sc = new Scanner(System.in);
		String firstString;
		String secondString;
		System.out.print("Please introduce the first random sentence: ");
		firstString = sc.nextLine();
		System.out.print("Please introduce the second random sentence: ");
		secondString = sc.nextLine();
		if(firstString.length() < secondString.length()) {
			System.out.println("\nThe first sentence is shorter than the second sentence.");
		} else {
			System.out.println("\nThe second sentence is shorter than the first sentence.");
		}
	}
}

/*Introducir por teclado dos frases e indicar cuál de ellas es la más corta,
 *es decir, la que contiene menos caracteres.
 */