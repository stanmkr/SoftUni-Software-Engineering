package RegularExpressionsLab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - RegularExpressionsLab
 * Date: July / 2022
 */
public class MathPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String telefono = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");
        Matcher matcher = pattern.matcher(telefono);

        List<String> telefonosValidos = new LinkedList<>();
        while (matcher.find()) {
            String tel = matcher.group();
            telefonosValidos.add(tel);
        }

        System.out.println(String.join(", ",telefonosValidos));
    }
}
