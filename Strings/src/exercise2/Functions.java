package exercise2;
import java.util.*;

public class Functions {
	
	public static void PasswordGuessingGame() {
		String password;
		String guess;
		Scanner sc = new Scanner(System.in);
		System.out.print("Player 1:\nIntroduce a password: ");
		password = sc.next();
		System.out.print("Player 2:\nIntroduce a guess: ");
		guess = sc.next();
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