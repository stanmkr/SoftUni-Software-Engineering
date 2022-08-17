import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: July / 2022
 */
public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);
        String comandos = scanner.nextLine();

        while (!comandos.contains("Travel")) {
            if (comandos.contains("Add Stop")) {
                int index = Integer.parseInt(comandos.split(":")[1]);
                String text = comandos.split(":")[2];
                if (isValidIndex(index, stopsBuilder)) {
                    stopsBuilder.insert(index, text);
                }
                System.out.println(stopsBuilder);
            } else if (comandos.contains("Remove Stop")) {
                int indexStart = Integer.parseInt(comandos.split(":")[1]);
                int indexFinal = Integer.parseInt(comandos.split(":")[2]);
                if (isValidIndex(indexStart, stopsBuilder) && isValidIndex(indexFinal, stopsBuilder)) {
                    stopsBuilder.delete(indexStart, indexFinal + 1);
                }
                System.out.println(stopsBuilder);
            } else if (comandos.contains("Switch")) {
                String textoAntiguo = comandos.split(":")[1];
                String textoNuevo = comandos.split(":")[2];
                if (stops.contains(textoAntiguo)) {
                    String textoActualizado = stopsBuilder.toString().replace(textoAntiguo, textoNuevo);
                    stopsBuilder = new StringBuilder(textoActualizado);
                }
                System.out.println(stopsBuilder);
            }
            comandos = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);

    }

    static boolean isValidIndex(int index, StringBuilder input) {
        return index >= 0 && index <= input.length()-1;
    }
}
