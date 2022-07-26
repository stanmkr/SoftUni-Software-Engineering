package Associative_Arrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadComandos = Integer.parseInt(scanner.nextLine());
        Map<String, String> clientes = new LinkedHashMap<>();
        String reg, nombre, matricula;
        for (int i = 1; i <= cantidadComandos; i++) {
            String[] input = scanner.nextLine().split(" ");
            reg = input[0];
            nombre = input[1];
            if (reg.equals("register")) {
                matricula = input[2];
                if (!clientes.containsKey(nombre)) {
                    clientes.put(nombre, matricula);
                    System.out.printf("%s registered %s successfully%n", nombre, matricula);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", clientes.get(nombre));
                }
            } else if (reg.equals("unregister")) {
                if (!clientes.containsKey(nombre)) {
                    System.out.printf("ERROR: user %s not found%n", nombre);
                } else {
                    clientes.remove(nombre);
                    System.out.printf("%s unregistered successfully%n", nombre);
                }
            }
        }

        clientes.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));

    }
}
