package TextProcessing_Lab;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Lab
 * Date: July / 2022
 */
public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabrasBaneadas = scanner.nextLine().split(", ");
        String texto = scanner.nextLine();
        int longitud;
        String p = "";
        for (String palabra : palabrasBaneadas) {
            if (texto.contains(palabra)) {
                longitud = palabra.length();
                for (int i = 0; i < longitud; i++) {
                    p += "*";
                }
                texto = texto.replace(palabra, p);
                p="";
            }
        }
        System.out.println(texto);
    }
}
