package Data_Types_and_Variables_exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date: May / 2022
 */
public class water_overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacidad = 255;
        int lineas, cantidad, llenado = 0;
        lineas = scanner.nextInt();
        for (int i = 0; i < lineas; i++) {
            cantidad = scanner.nextInt();
            if (llenado + cantidad > capacidad)
                System.out.println("Insufficient capacity!");
            else {
                llenado += cantidad;
            }

        }
        System.out.println(llenado);


    }
}
