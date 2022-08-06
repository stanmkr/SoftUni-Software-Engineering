package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - RegularExpressionsExercises
 * Date: July / 2022
 */
public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double total = 0;
        List<String> furnitures = new ArrayList<>();
        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                furnitures.add(matcher.group("furniture"));
                int cantidad = Integer.parseInt(matcher.group("quantity"));
                total += Double.parseDouble(matcher.group("price")) * cantidad;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String mueble : furnitures) {
            System.out.println(mueble);
        }
        System.out.printf("Total money spend: %.2f", total);

    }
}
