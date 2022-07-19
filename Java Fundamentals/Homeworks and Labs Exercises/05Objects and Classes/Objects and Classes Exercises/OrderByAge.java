package Objects_and_Classes_Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        String comando = scanner.nextLine();
        while (!comando.equals("End")) {
            String nombre = comando.split(" ")[0];
            String id = comando.split(" ")[1];
            int edad = Integer.parseInt(comando.split(" ")[2]);
            Persona persona = new Persona(nombre, id, edad);
            personas.add(persona);
            comando = scanner.nextLine();
        }

        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getEdad()-o2.getEdad();
            }
        });
        for (Persona persona : personas) {
            System.out.println(persona);
        }


    }

    static class Persona {
        private String nombre, id;
        private int edad;

        public Persona(String nombre, String id, int edad) {
            this.nombre = nombre;
            this.id = id;
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public String toString() {
            return this.nombre + " with ID: " + this.id + " is " + this.edad + " years old.";
        }
    }
}
