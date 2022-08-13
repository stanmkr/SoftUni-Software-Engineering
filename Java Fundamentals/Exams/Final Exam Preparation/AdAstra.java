import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        String regex = "(?<symbols>[#\\|])(?<comida>[A-za-z\\s]+)(\\1)(?<fechaCaducidad>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calorias>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        List<String> items = new ArrayList<>();

        int caloriasTotales = 0;

        while (matcher.find()) {
            String comida = matcher.group("comida");
            String fechaCaducidad = matcher.group("fechaCaducidad");
            int calorias = Integer.parseInt(matcher.group("calorias"));
            caloriasTotales += calorias;

            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d", comida, fechaCaducidad, calorias));
        }

        System.out.printf("You have food to last you for: %d days!%n", caloriasTotales / 2000);
        items.forEach(System.out::println);

    }
}
