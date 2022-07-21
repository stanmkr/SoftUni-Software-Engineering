package Objects_and_Classes_Exercises;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeFrases = Integer.parseInt(scanner.nextLine());

        String[] frases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] eventos = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] autores = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] ciudades = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        String frase = "";
        Random random = new Random();
        int aleatorioFrases, aleatorioEventos, aleatorioAutores, aleatorioCiudades;
        for (int i = 0; i < numeroDeFrases; i++) {
            aleatorioFrases = random.nextInt(frases.length);
            aleatorioEventos = random.nextInt(eventos.length);
            aleatorioAutores = random.nextInt(autores.length);
            aleatorioCiudades = random.nextInt(ciudades.length);
            frase += frases[aleatorioFrases] + " " + eventos[aleatorioEventos] + " " + autores[aleatorioAutores] + " - " + ciudades[aleatorioCiudades];
            System.out.println(frase);
            frase ="";
        }

    }


}
