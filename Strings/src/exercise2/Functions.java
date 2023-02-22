package exercise2;
import java.util.*;

public class Functions {
	
	public static void passwordGuessingGame() {
		String password;
		String guess;
		Scanner sc = new Scanner(System.in);
		System.out.print("Player 1:\nIntroduce a password: ");
		password = sc.next();
		do {
			System.out.print("Player 2:\nIntroduce a guess: ");
			guess = sc.next();
			if(password.compareTo(guess) < 0) {
				System.out.println("String resulted with a negative value.");
			} else if(password.compareTo(guess) > 0) {
				System.out.println("String resulted with a positive value.");
			}
		}
		while(!password.equals(guess));
		System.out.println("Congratulations! You guessed Player 1's password!");
		sc.close();
	}
}

/*Diseña el juego “Acierta la contraseña”.
 *La mecánica del juego es la siguiente: el primer jugador introduce la contraseña;
 *a continuación, el segundo jugador debe teclear palabras hasta que la acierte.
 *El juego debe indicar si la palabra introducida es mayor o menor alfabéticamente que la contraseña.
 *
 *VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor alfabéticamente que la contraseña,
 *debe mostrar una cadena con los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.
 */