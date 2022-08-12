package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - RegularExpressionsExercises
 * Date: July / 2022
 */
public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMensajes = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetaNombre>[A-Za-z]+)[^@!:>-]*:(?<planetaPoblacion>[0-9]+)[^@!:>-]*!(?<tipoAtaque>[AD])![^@!:>-]*->(?<soldadosCantidad>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> planetasAtacadas = new ArrayList<>();  // atack type A
        List<String> planetasDestruidas = new ArrayList<>(); // atack type D
        for (int i = 1; i <= numeroMensajes; i++) {
            String mensajeEncriptado = scanner.nextLine();
            String mensajeDecriptado = getMensajeDecriptado(mensajeEncriptado);

            Matcher matcher = pattern.matcher(mensajeDecriptado);
            if (matcher.find()) {
                String planetaNombre = matcher.group("planetaNombre");
                String tipoAtaque = matcher.group("tipoAtaque");
                //   int planetaPoblacion = Integer.parseInt(matcher.group("planetaPoblacion"));
                // int soldadosCantidad = Integer.parseInt(matcher.group("soldadosCantidad"));
                if (tipoAtaque.equals("A")) {
                    planetasAtacadas.add(planetaNombre);
                } else if (tipoAtaque.equals("D")) {
                    planetasDestruidas.add(planetaNombre);
                }
            }



        }
        System.out.println("Attacked planets: " + planetasAtacadas.size());
        Collections.sort(planetasAtacadas);
        for (String planetasAtacada : planetasAtacadas) {
            System.out.println("-> " + planetasAtacada);
        }

        System.out.println("Destroyed planets: " + planetasDestruidas.size());
        Collections.sort(planetasDestruidas);
        for (String planetasDestruida : planetasDestruidas) {
            System.out.println("-> " + planetasDestruida);
        }

    }

    private static String getMensajeDecriptado(String mensajeEncriptado) {
        StringBuilder mensajeDecriptado = new StringBuilder();
        int cantidadLetras = getLetrasEspecialesCantidad(mensajeEncriptado);

        // decriptación
        //1. всеки символ от критпираното съобщение
        //2. нов символ -> ascii на нов символ = ascii на текущия символ - countLetters
        //3. добавяме нов символ
        for (char letra : mensajeEncriptado.toCharArray()) {
            char nuevaLetra = (char) (letra - cantidadLetras);
            mensajeDecriptado.append(nuevaLetra);
        }

        return mensajeDecriptado.toString();
    }

    private static int getLetrasEspecialesCantidad(String mensajeEncriptado) {
        int cantidad = 0;
        for (char letra : mensajeEncriptado.toCharArray()) {
            switch (letra) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    cantidad++;
                    break;
            }
        }

        return cantidad;
    }
}
