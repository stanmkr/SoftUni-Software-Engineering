import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasGanado = true;
        int batallasGanadas = 0;
        int distancia;
        int energia = Integer.parseInt(scanner.nextLine());
        while (energia >= 0) {
            String command = scanner.nextLine();
            if (command.equals("End of battle")) {
                break;
            } else {
                distancia = Integer.parseInt(command);
                if (distancia > energia) {
                    hasGanado = false;
                    break;
                } else {
                    batallasGanadas++;
                    energia = energia - distancia;
                    if (batallasGanadas % 3 == 0) {
                        energia = energia + batallasGanadas;
                    }
                }
            }
        }

        if (hasGanado) {
            System.out.printf("Won battles: %d. Energy left: %d", batallasGanadas, energia);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", batallasGanadas, energia);
        }

    }
}
