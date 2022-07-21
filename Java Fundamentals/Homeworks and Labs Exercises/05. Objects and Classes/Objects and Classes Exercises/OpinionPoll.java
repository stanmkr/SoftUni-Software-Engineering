package Objects_and_Classes_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPersonas = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numeroPersonas; i++) {
            String input = scanner.nextLine();
            String nombre = input.split(" ")[0];
            int edad = Integer.parseInt(input.split(" ")[1]);

            Persona persona = new Persona(nombre, edad);
            if (persona.getEdad()>30){
                System.out.println(persona);
            }
        }


    }

    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }


        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public String toString() {
            return this.nombre + " - " +this.edad;
        }
    }

}
