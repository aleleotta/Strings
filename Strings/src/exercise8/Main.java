package exercise8;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String phrase = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a phrase in Javalan:");
		phrase = sc.nextLine();
		sc.close();
	}
}

/*Los habitantes de Javalandia tienen un idioma algo extraño;
 *cuando hablan siempre comienzan sus frases con “Javalín, javalón”,
 *para después hacer una pausa más o menos larga
 *(la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje.
 *Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
 *más o menos prolongado y la coletilla “javalén, len, len”. Se pide diseñar un traductor que, en primer lugar,
 *nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos),
 *y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 */