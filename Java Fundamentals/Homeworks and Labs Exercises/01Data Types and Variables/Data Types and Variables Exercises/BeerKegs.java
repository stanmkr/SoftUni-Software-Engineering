package Data_Types_and_Variables_exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Data_Types_and_Variables - Data_Types_and_Variables_exercises
 * Date: May / 2022
 */
public class beer_kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double mayor = Double.MIN_VALUE;
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        String maxModel = "";

        for (int i = 0; i < numberOfLines; i++) {
            String nombre = scanner.nextLine();
            double radio = Double.parseDouble(scanner.nextLine());
            int altura = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radio, 2) * altura;
            if (volume > mayor) {
                mayor = volume;
                maxModel = nombre;

            }

        }
        System.out.println(maxModel);
    }
}
