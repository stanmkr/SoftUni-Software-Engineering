import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroCoches = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> listaCoches = new LinkedHashMap<>();

        for (int i = 1; i <= numeroCoches; i++) {
            String coches = scanner.nextLine();
            String modelo = coches.split("\\|")[0];
            int kilometros = Integer.parseInt(coches.split("\\|")[1]);
            int combustible = Integer.parseInt(coches.split("\\|")[2]);

            listaCoches.putIfAbsent(modelo, new ArrayList<>());
            listaCoches.get(modelo).add(0, kilometros);
            listaCoches.get(modelo).add(1, combustible);
        }
        String comandos = scanner.nextLine();
        while (!comandos.equals("Stop")) {
            String coche = comandos.split(" : ")[1];
            int kilometros = listaCoches.get(coche).get(0);
            int combustible = listaCoches.get(coche).get(1);
            if (comandos.contains("Drive")) {
                int distancia = Integer.parseInt(comandos.split(" : ")[2]);
                int combustibleConsumido = Integer.parseInt(comandos.split(" : ")[3]);
                if (listaCoches.containsKey(coche)) {
                    if (combustible >= combustibleConsumido) {
                        listaCoches.get(coche).set(0, kilometros + distancia);
                        listaCoches.get(coche).set(1, combustible - combustibleConsumido);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", coche, distancia, combustibleConsumido);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (listaCoches.get(coche).get(0) >= 100000) {
                        System.out.println("Time to sell the " + coche + "!");
                        listaCoches.remove(coche);

                    }
                }

            } else if (comandos.contains("Refuel")) {
                int combustibleRellenar = Integer.parseInt(comandos.split(" : ")[2]);
                int combustibleTotal = combustibleRellenar + combustible;
                int diferencia = 0;
                if (combustibleTotal > 75) {
                    diferencia = 75 - combustible;
                    combustibleTotal = 75;
                } else {
                    diferencia = combustibleRellenar;
                }
                listaCoches.get(coche).set(1, combustibleTotal);
                System.out.printf("%s refueled with %d liters%n", coche, diferencia);

            } else if (comandos.contains("Revert")) {
                int kmParaReducir = Integer.parseInt(comandos.split(" : ")[2]);
                int totalKilometros = kilometros - kmParaReducir;
                if (totalKilometros < 10000) {
                    totalKilometros = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", coche, kmParaReducir);
                }
                listaCoches.get(coche).set(0, totalKilometros);
            }
            comandos = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : listaCoches.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
