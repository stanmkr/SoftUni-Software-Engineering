import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder mensaje = new StringBuilder(scanner.nextLine());

        String comandos = scanner.nextLine();
        while (!comandos.equals("Reveal")) {
            String accion = comandos.split(":\\|:")[0];
            switch (accion) {
                case "InsertSpace":
                    int index = Integer.parseInt(comandos.split(":\\|:")[1]);
                    if (isValidIndex(mensaje, index)) {
                        mensaje.insert(index, " ");
                    }
                    System.out.println(mensaje);
                    break;
                case "Reverse":
                    String subString = comandos.split(":\\|:")[1];
                    if (mensaje.toString().contains(subString)) {
                        mensaje = new StringBuilder(mensaje.toString().replace(subString, ""));

                        StringBuilder subStringReverse = new StringBuilder(subString);
                        subStringReverse.reverse();
                        mensaje.append(subStringReverse);
                        System.out.println(mensaje);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    subString = comandos.split(":\\|:")[1];
                    String reemplazo = comandos.split(":\\|:")[2];
                    mensaje = new StringBuilder(mensaje.toString().replace(subString, reemplazo));
                    System.out.println(mensaje);


                    break;
            }

            comandos = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + mensaje);
    }


    public static boolean isValidIndex(StringBuilder texto, int index) {
        return index >= 0 && index <= texto.length();
    }
}
