package Associative_Arrays_Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String usuario, lenguaje, accion;
        int puntos;
        Map<String, Integer> usuariosPuntos = new LinkedHashMap<>();
        Map<String, Integer> lenguajesCount = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            usuario = input.split("-")[0];
            if (input.split("-")[1].equals("banned")) {
                usuariosPuntos.remove(usuario);
            } else {
                lenguaje = input.split("-")[1];
                puntos = Integer.parseInt(input.split("-")[2]);
                if (!usuariosPuntos.containsKey(usuario)) {
                    usuariosPuntos.put(usuario, puntos);
                } else {
                    int puntosActuales = usuariosPuntos.get(usuario);
                    if (puntos > puntosActuales) {
                        usuariosPuntos.put(usuario, puntos);
                    }
                }
                if (!lenguajesCount.containsKey(lenguaje)) {
                    lenguajesCount.put(lenguaje, 1);
                } else {
                    lenguajesCount.put(lenguaje, lenguajesCount.get(lenguaje) + 1);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : usuariosPuntos.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : lenguajesCount.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }


    }
}
