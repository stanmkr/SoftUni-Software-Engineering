package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - RegularExpressionsLab
 * Date: July / 2022
 */
public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fechas = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");

        Matcher matcher = pattern.matcher(fechas);


        while (matcher.find()) {
            String dia = matcher.group("day");
            String mes = matcher.group("month");
            String anyo = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", dia, mes, anyo);
        }

    }
}
