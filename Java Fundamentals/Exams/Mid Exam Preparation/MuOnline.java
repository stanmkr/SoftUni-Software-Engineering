import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vida = 100, bitcoins = 0, bestRoom = 0;
        List<String> habitacionesSeparadosPorTuberia = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        boolean hasGanado = true;
        for (int i = 0; i < habitacionesSeparadosPorTuberia.size(); i++) {
            bestRoom++;
            String[] habitacion = habitacionesSeparadosPorTuberia.get(i).split(" ");
            switch (habitacion[0]) {
                case "potion":
                    int potion = Integer.parseInt(habitacion[1]);
                    int vidaActual = vida;
                    vida += potion;
                    if (vida > 100) {
                        vida = 100;
                        System.out.printf("You healed for %d hp.%n", 100 - vidaActual);
                    } else {
                        System.out.printf("You healed for %d hp.%n", potion);

                    }
                    System.out.printf("Current health: %d hp.%n", vida);
                    break;
                case "chest":
                    int btc = Integer.parseInt(habitacion[1]);
                    bitcoins += btc;
                    System.out.printf("You found %d bitcoins.%n", btc);
                    break;
                default:
                    int ataque = Integer.parseInt(habitacion[1]);
                    String monsterName = habitacion[0];
                    if (vida - ataque > 0) {
                        vida -= ataque;
                        System.out.printf("You slayed %s.%n", monsterName);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monsterName);
                        System.out.println("Best room: " + bestRoom);
                        hasGanado = false;
                        break;
                    }
                    break;
            }
        }

        if (hasGanado) {
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + bitcoins);
            System.out.println("Health: " + vida);
        }


    }
}
