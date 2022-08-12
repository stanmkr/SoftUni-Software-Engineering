import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class Diccionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> diccionario = new LinkedHashMap<>();
        String[] palabrasYdefiniciones = input.split(" \\| ");


        for (int i = 0; i < palabrasYdefiniciones.length; i++) {
            String palabra = palabrasYdefiniciones[i].split(": ")[0];
            String definicion = palabrasYdefiniciones[i].split(": ")[1];
            if (!diccionario.containsKey(palabra)) {
                diccionario.put(palabra, new ArrayList<>());
                diccionario.get(palabra).add(definicion);
            } else {
                diccionario.get(palabra).add(definicion);
            }
        }

        input = scanner.nextLine();
        String[] palabras = input.split(" \\| ");
        input = scanner.nextLine();
        switch (input) {
            case "Test":
                for (int i = 0; i < palabras.length; i++) {
                    if (diccionario.containsKey(palabras[i])) {
                        printPalabras(diccionario, palabras[i]);
                    }
                }
                break;
            case "Hand Over":
                for (Map.Entry<String, List<String>> entry : diccionario.entrySet()) {
                    System.out.printf("%s ", entry.getKey());
                }
                break;
        }
    }

    public static void printPalabras(Map<String, List<String>> map, String palabra) {
        List<String> lista = map.get(palabra);
        System.out.printf("%s:%n-%s", palabra, String.join("\n-",lista));

    }
}
