import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: July / 2022
 */
public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sitios = scanner.nextLine();
        String regex = "([=|\\/])(?<destination>[A-Z][A-Za-z]{2,}+)\\1";

        List<String> destinos = new ArrayList<>();
        int travelPoints = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sitios);
        while (matcher.find()) {
            destinos.add(matcher.group("destination"));
            travelPoints += matcher.group("destination").length();


        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinos));
        System.out.println("Travel Points: " + travelPoints);


    }
}
