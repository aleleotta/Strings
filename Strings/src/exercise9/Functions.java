package exercise9;
import java.util.*;

public class Functions {
}

/*Disponemos de la siguiente relación de letras:
(Mirar enunciado para ver un mejor esquema.)
conjunto 1: e i k m p q r s t u v
conjunto 2: p v i u m t e r k q s

mediante la cual es posible codificar un texto, convirtiendo cada letra del conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación en minúsculas.
Un ejemplo: la palabra «PaquiTo» se codifica como «matqvko».
Se pide realizar un programa codificador, en el que se implemente la función:
char codifica(char conjunto1[],char conjunto2[], char c)
que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
*/