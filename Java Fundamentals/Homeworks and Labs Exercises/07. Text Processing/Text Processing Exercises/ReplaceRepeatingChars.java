package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder texto = new StringBuilder(scanner.nextLine());
        StringBuilder resultado = new StringBuilder();
        char primeraOcurrencia = texto.charAt(0);
        resultado.append(primeraOcurrencia);

        for (int i = 1; i < texto.length(); i++) {
            char simbolo = texto.charAt(i);
            if (simbolo != primeraOcurrencia){
                resultado.append(simbolo);
                primeraOcurrencia = simbolo;
            }
        }
        System.out.println(resultado);
    }
}
