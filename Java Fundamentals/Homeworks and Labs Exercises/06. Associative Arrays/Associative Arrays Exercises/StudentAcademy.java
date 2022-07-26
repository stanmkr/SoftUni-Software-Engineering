package Associative_Arrays_Exercises;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> cualificaciones = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String nombre = scanner.nextLine();
            double nota = Double.parseDouble(scanner.nextLine());

            if (!cualificaciones.containsKey(nombre)) {
                cualificaciones.put(nombre, new ArrayList<>());
                cualificaciones.get(nombre).add(nota);
            } else {
                cualificaciones.get(nombre).add(nota);
            }
        }

        Map<String, Double> cualificacionesMedias = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : cualificaciones.entrySet()) {
            String nombre = entry.getKey();
            List<Double> notas = entry.getValue();
            double media = getNotaMedia(notas);
            if (media >= 4.5) {
                cualificacionesMedias.put(nombre, media);
            }
        }

        cualificacionesMedias.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));


    }

    private static double getNotaMedia(List<Double> notas) {
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
