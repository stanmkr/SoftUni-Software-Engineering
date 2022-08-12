import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([#|@]+)(?<color>[a-z]{3,}+)[#|@]+([^A-Za-z0-9]*)(\\/+)(?<cantidad>[0-9]+)\\4";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            String color = matcher.group("color");
            int cantidad = Integer.parseInt(matcher.group("cantidad"));

            System.out.printf("You found %d %s eggs!%n", cantidad, color);
        }


    }
}
