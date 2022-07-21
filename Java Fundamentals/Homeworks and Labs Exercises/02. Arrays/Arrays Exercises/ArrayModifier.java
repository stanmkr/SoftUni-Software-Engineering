package Arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Arrays_exercises
 * Date: June / 2022
 */
public class array_modifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matriz = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String texto = scanner.nextLine();

        while (!texto.equals("end")) {
            String[] indices = texto.split(" ");
            String accion = indices[0];
            switch (accion) {
                case "swap":
                    int index1 = Integer.parseInt(indices[1]);
                    int element1 = matriz[index1];
                    int index2 = Integer.parseInt(indices[2]);
                    int element2 = matriz[index2];
                    matriz[index1] = element2;
                    matriz[index2] = element1;
                    break;
                case "multiply":
                    int multiplication = matriz[Integer.parseInt(indices[1])] * matriz[Integer.parseInt(indices[2])];
                    matriz[Integer.parseInt(indices[1])] = multiplication;
                    break;
                case "decrease":
                    for (int i = 0; i < matriz.length; i++) {
                        matriz[i] -= 1;
                    }
                    break;
            }
            texto = scanner.nextLine();


        }
        for (int i = 0; i < matriz.length; i++) {
            if (i == matriz.length - 1) {
                System.out.print(matriz[i] + "");
            } else {
                System.out.print(matriz[i] + ", ");
            }
        }

    }
}
