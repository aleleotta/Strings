package exercise8;
import java.util.*;

public class Functions {
	
	public static boolean javalanCheck(String phrase) {
		boolean check = false;
		if(phrase.startsWith("Javalin, javalon\t")) {
			check = true;
		} else if(phrase.endsWith("\tJavalin, javalon")) {
			check = true;
		}
		return check;
	}
	
	public static String translate(String phrase) {
		phrase = phrase.replace("Javalin, javalon", "");
		phrase = phrase.replace("Javalin, javalon", "");
		phrase = phrase.trim();
		return phrase;
	}
}

//La cadena inicia o termina con "Javalin, javalon".
//Se tiene que traducir el dialecto a lenguaje normal usando: startsWith(), endsWith(), replace(), trim().

/*Los habitantes de Javalandia tienen un idioma algo extraño;
 *cuando hablan siempre comienzan sus frases con “Javalín, javalón”,
 *para después hacer una pausa más o menos larga
 *(la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje.
 *Existe un dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con un silencio,
 *más o menos prolongado y la coletilla “javalén, len, len”. Se pide diseñar un traductor que, en primer lugar,
 *nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos),
 *y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 */