package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineas = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lineas; i++) {
            String texto = scanner.nextLine();
            int nombreComienzo = texto.indexOf("@");
            int nombreFinal = texto.indexOf("|");
            String nombre = texto.substring(nombreComienzo + 1, nombreFinal);
            int edadComienzo = texto.indexOf("#");
            int edadCFinal = texto.indexOf("*");
            int edad = Integer.parseInt(texto.substring(edadComienzo + 1, edadCFinal));
            System.out.printf("%s is %d years old.%n", nombre, edad);
        }
    }
}
