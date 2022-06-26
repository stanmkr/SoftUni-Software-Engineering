import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ruta = Arrays.stream(scanner.nextLine().split("\\|\\|")).collect(Collectors.toList());
        int combustible = Integer.parseInt(scanner.nextLine());
        int municion = Integer.parseInt(scanner.nextLine());

        boolean llegada = false;
        boolean misionCumplida = true;

        {
            for (int i = 0; i < ruta.size(); i++) {
                if (llegada || !misionCumplida) {
                    break;
                }
                String[] viajes = ruta.get(i).split(" ");
                String comando = viajes[0];

                switch (comando) {
                    case "Repair":
                        int suplies = Integer.parseInt(viajes[1]);
                        combustible += suplies;
                        municion += suplies * 2;
                        System.out.printf("Ammunitions added: %d.%n", suplies * 2);
                        System.out.printf("Fuel added: %d.%n", suplies);

                        break;
                    case "Travel":
                        int distancia = Integer.parseInt(viajes[1]);
                        combustible -= distancia;
                        if (combustible >= 0) {
                            System.out.printf("The spaceship travelled %d light-years.%n", distancia);
                        } else {
                            System.out.println("Mission failed.");
                            misionCumplida = false;
                            break;
                        }
                        break;
                    case "Enemy":
                        int armaduraEnemigo = Integer.parseInt(viajes[1]);
                        if (municion >= armaduraEnemigo) {
                            municion -= armaduraEnemigo;
                            System.out.printf("An enemy with %d armour is defeated.%n", armaduraEnemigo);
                        } else {
                            combustible -= armaduraEnemigo * 2;
                            if (combustible >= 0) {
                                System.out.printf("An enemy with %d armour is outmaneuvered.%n", armaduraEnemigo);
                            } else {
                                System.out.println("Mission failed.");
                                misionCumplida = false;
                            }
                        }
                        break;

                    case "Titan":
                        llegada = true;
                        break;

                }


            }


            if (llegada) {
                System.out.println("You have reached Titan, all passengers are safe.");
            }


        }
    }
}
