import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: June / 2022
 */
public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saqueoTotal = 0;
        int diasDuracion = scanner.nextInt();
        int cuantoPorDia = scanner.nextInt();
        int saqueoEsperado = scanner.nextInt();

        for (int i = 1; i <= diasDuracion; i++) {
            saqueoTotal += cuantoPorDia;
            if (i % 3 == 0 && i % 5 == 0) {
                saqueoTotal += cuantoPorDia / 2.0;
                saqueoTotal = saqueoTotal - saqueoTotal * 0.3;

            } else if (i % 3 == 0) {
                saqueoTotal += cuantoPorDia / 2.0;

            } else if (i % 5 == 0) {
                saqueoTotal = saqueoTotal - saqueoTotal * 0.3;
            }


        }

        double falta = saqueoEsperado - saqueoTotal;
        if (saqueoTotal >= saqueoEsperado) {
            System.out.printf("Ahoy! %.2f plunder gained.", saqueoTotal);
        } else {
            double porcentaje = saqueoTotal * 100 / saqueoEsperado;
            System.out.printf("Collected only %.2f%% of the plunder.", porcentaje);
        }
    }
}
