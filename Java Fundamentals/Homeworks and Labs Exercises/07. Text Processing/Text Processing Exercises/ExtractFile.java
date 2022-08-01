package TextProcessing_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - TextProcessing_Exercises
 * Date: July / 2022
 */
public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ruta = scanner.nextLine().split("\\\\");
        String nombreCompleto = ruta[ruta.length - 1];
        String nombreArchivo = nombreCompleto.split("\\.")[0];
        String extension = nombreCompleto.split("\\.")[1];

        System.out.printf("File name: %s%nFile extension: %s", nombreArchivo, extension);

    }
}
