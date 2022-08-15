import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int cantidad = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plantasYRarezas = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMedio = new LinkedHashMap<>();
        for (int i = 1; i <= cantidad; i++) {
            String informacionPlantas = scanner.nextLine();
            String planta = informacionPlantas.split("<->")[0];
            double rareza = Double.parseDouble(informacionPlantas.split("<->")[1]);
            if (!plantasYRarezas.containsKey(planta)) {
                plantasYRarezas.put(planta, new ArrayList<>());
                plantasYRarezas.get(planta).add(0, rareza);
                plantasYRarezas.get(planta).add(1, 0.0);
                ratingMedio.put(planta, new ArrayList<>());


            } else {
                double rarezaActual = plantasYRarezas.get(planta).get(0);
                plantasYRarezas.get(planta).set(0, rarezaActual + rareza);
            }

        }
        String comandos = scanner.nextLine();
        while (!comandos.equals("Exhibition")) {
            String planta = comandos.split(" ")[1];
            if (comandos.contains("Rate")) {
                if (plantasYRarezas.containsKey(planta)) {
                    double rating = Double.parseDouble(comandos.split(" ")[3]);
                    plantasYRarezas.get(planta).set(1, rating);
                    ratingMedio.get(planta).add(0,rating);
                } else {
                    System.out.println("error");
                }

            } else if (comandos.contains("Update")) {
                if (plantasYRarezas.containsKey(planta)) {
                    double nuevaRareza = Double.parseDouble(comandos.split(" ")[3]);
                    plantasYRarezas.get(planta).set(0, nuevaRareza);
                } else {
                    System.out.println("error");
                }


            } else if (comandos.contains("Reset")) {
                if (plantasYRarezas.containsKey(planta)) {
                    plantasYRarezas.get(planta).set(1, 0.0);
                    ratingMedio.get(planta).clear();
                } else {
                    System.out.println("error");
                }
            }
            comandos = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Double>> entry : plantasYRarezas.entrySet()) {
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", entry.getKey(), entry.getValue().get(0),
                     ratingMedio.get(entry.getKey())
                    .stream().mapToDouble(Double::doubleValue)
                    .average().orElse(0.0));
        }

    }

}
