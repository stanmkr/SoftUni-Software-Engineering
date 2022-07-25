package Associative_Arrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> coleccion = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int cantidad = Integer.parseInt(scanner.nextLine());
            if (!coleccion.containsKey(resource)) {
                coleccion.put(resource, cantidad);
            } else {
                coleccion.put(resource, coleccion.get(resource) + cantidad);
            }

            resource = scanner.nextLine();

        }

        coleccion.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));

    }
}
