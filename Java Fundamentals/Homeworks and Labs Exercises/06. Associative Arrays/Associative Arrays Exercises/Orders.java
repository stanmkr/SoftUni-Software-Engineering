package Associative_Arrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> precioProductos = new LinkedHashMap<>();
        Map<String, Integer> cantidadProductos = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String nombre = input.split(" ")[0];
            double precio = Double.parseDouble(input.split(" ")[1]);
            int cantidad = Integer.parseInt(input.split(" ")[2]);

            precioProductos.put(nombre, precio);

            if (!cantidadProductos.containsKey(nombre)) {
                cantidadProductos.put(nombre, cantidad);
            } else {
                cantidadProductos.put(nombre, cantidadProductos.get(nombre) + cantidad);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : precioProductos.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * cantidadProductos.get(entry.getKey()));
        }


    }
}
