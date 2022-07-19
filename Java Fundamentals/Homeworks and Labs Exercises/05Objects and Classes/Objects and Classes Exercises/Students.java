package Objects_and_Classes_Exercises;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEstudiantes = Integer.parseInt(scanner.nextLine());
        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 1; i <= numeroEstudiantes; i++) {
            String estudiante = scanner.nextLine();
            String nombre = estudiante.split(" ")[0];
            String apellido = estudiante.split(" ")[1];
            double nota = Double.parseDouble(estudiante.split(" ")[2]);
            Estudiante s = new Estudiante(nombre, apellido, nota);
            estudiantes.add(s);
        }

        estudiantes.sort(Comparator.comparingDouble(Estudiante::getNota).reversed());


        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }


    }

    static class Estudiante {
        private String nombre, apellido;
        private double nota;

        public Estudiante(String nombre, String apellido, double nota) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.nota = nota;
        }

        public double getNota() {
            return nota;
        }

        @Override
        public String toString() {

            return String.format("%s %s: %.2f", this.nombre, this.apellido, this.nota);
        }


    }


}
