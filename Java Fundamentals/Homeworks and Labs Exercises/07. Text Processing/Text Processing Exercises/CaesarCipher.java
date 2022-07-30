package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textoSinEncriptar = scanner.nextLine();
        String textoEncriptado = "";
        //  StringBuilder textoEncriptado = new StringBuilder();

        for (int i = 0; i < textoSinEncriptar.length(); i++) {
            char simbolo = textoSinEncriptar.charAt(i);
            char simboloEncriptado = (char) (simbolo + 3);
            textoEncriptado += (simboloEncriptado);
            //textoEncriptado.append(simboloEncriptado);
        }
        System.out.println(textoEncriptado);
    }
}
