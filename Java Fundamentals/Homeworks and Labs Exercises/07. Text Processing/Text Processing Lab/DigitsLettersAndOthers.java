package TextProcessing_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Lab
 * Date: July / 2022
 */
public class DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        String numeros = "";
        String letras = "";
        String caracteres = "";

        char array[] = texto.toCharArray();
        for (char charact : array) {
            if (Character.isDigit(charact)){
                numeros+=charact;
            } else if (Character.isAlphabetic(charact)) {
                letras+=charact;
            } else {
                caracteres+=charact;
            }
        }

        System.out.println(numeros);
        System.out.println(letras);
        System.out.println(caracteres);
    }
}
