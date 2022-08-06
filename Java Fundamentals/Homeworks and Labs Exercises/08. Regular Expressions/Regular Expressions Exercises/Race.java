package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - RegularExpressionsExercises
 * Date: July / 2022
 */
public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participantesNombres = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        Map<String, Integer> participantesDistancias = new LinkedHashMap<>();

        for (String nombre : participantesNombres) {
            participantesDistancias.put(nombre, 0);
        }

        String regexLetras = "[A-Za-z]+";
        String regexCifras = "[0-9]";
        Pattern patternLetras = Pattern.compile(regexLetras);
        Pattern patternCifras = Pattern.compile(regexCifras);


        while (!input.equals("end of race")) {
            // input  = "G!32e%o7r#32g$235@!2e"
            Matcher matcherLetras = patternLetras.matcher(input);
            Matcher matcherCifras = patternCifras.matcher(input);
            String nombre = "";

            while (matcherLetras.find()) {
                nombre +=(matcherLetras.group());
            }

            int distancia = 0;
            while (matcherCifras.find()) {
                distancia += Integer.parseInt(matcherCifras.group());
            }
            if (participantesNombres.contains(nombre)){
                int distanciaActual = participantesDistancias.get(nombre);
                participantesDistancias.put(nombre,distanciaActual+distancia);
            }

            input = scanner.nextLine();
        }

        List<Map.Entry<String,Integer>> lista = new ArrayList<>(participantesDistancias.entrySet());

        lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


//        List<String> top3 = participantesDistancias.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(3)
//                .map(entry -> entry.getKey())
//                .collect(Collectors.toList());
//
//        System.out.println("1st place: " +top3.get(0));
//        System.out.println("2nd place: " +top3.get(1));
        System.out.println("1st place: " +lista.get(0).getKey());//        System.out.println("1st place: " +lista.get(0));
        System.out.println("2nd place: " +lista.get(1).getKey());
        System.out.println("3rd place: " +lista.get(2).getKey());

    }
}
