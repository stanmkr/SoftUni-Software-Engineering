package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - RegularExpressionsExercises
 * Date: July / 2022
 */
public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<nombre>[A-Z][a-z]*)%[^|$%.]*<(?<producto>\\w+)>[^|$%.]*\\|(?<cantidad>\\d+)\\|[^|$%.]*?(?<precio>[0-9]+\\.*[0-9]*)\\$";
       // String regex = "%(?<nombre>[A-Z][a-z]*)%[^|$%.]*<(?<producto>\\w+)>[^|$%.]*\\|(?<cantidad>[0-9]+)\\|[^|$%.]*?(?<precio>[0-9]+\\.*[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double total = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String nombreCliente = matcher.group("nombre");
                String nombreProducto = matcher.group("producto");
                int cantidad = Integer.parseInt(matcher.group("cantidad"));
                double precio = Double.parseDouble(matcher.group("precio"));
                double currentTotal = cantidad * precio;
                total += cantidad * precio;
                System.out.printf("%s: %s - %.2f%n", nombreCliente, nombreProducto, currentTotal);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", total);
    }
}
