import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - PACKAGE_NAME
 * Date: August / 2022
 */
public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder mensajeEncriptado = new StringBuilder(scanner.nextLine());
        String comandos = scanner.nextLine();
        while (!comandos.equals("Decode")) {
            String accion = comandos.split("\\|")[0];
            switch (accion) {
                case "Move":
                    int cantidadLetras = Integer.parseInt(comandos.split("\\|")[1]);
                    String subString = mensajeEncriptado.toString().substring(0, cantidadLetras);
                    mensajeEncriptado.replace(0, cantidadLetras, "");
                    mensajeEncriptado.append(subString);
                    break;
                case "Insert":
                    int index = Integer.parseInt(comandos.split("\\|")[1]);
                    String valor = (comandos.split("\\|")[2]);
                    mensajeEncriptado.insert(index, valor);
                    break;
                case "ChangeAll":
                    subString = (comandos.split("\\|")[1]);
                    String reemplazo = (comandos.split("\\|")[2]);
                    mensajeEncriptado = new StringBuilder(mensajeEncriptado.toString().replace(subString, reemplazo));
                    break;
            }
            comandos = scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+mensajeEncriptado);
    }
}
