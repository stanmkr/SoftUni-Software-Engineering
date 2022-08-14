import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: July / 2022
 */
public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        List<String> validasPares = new ArrayList<>();
        String regex = "(#|@)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        int cuentaPares = 0;
        while (matcher.find()) {
            String primeraPalabra = matcher.group("firstWord");
            String segundaPalabra = matcher.group("secondWord");
            cuentaPares++;
            StringBuilder segundaPalabraBuilder = new StringBuilder(segundaPalabra);
            if (primeraPalabra.equals(segundaPalabraBuilder.reverse().toString())) {
                validasPares.add(primeraPalabra + " <=> " + segundaPalabra);
            }
        }

        if (cuentaPares == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.println(cuentaPares + " word pairs found!");
        }


        if (validasPares.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validasPares));
        }

    }
}
