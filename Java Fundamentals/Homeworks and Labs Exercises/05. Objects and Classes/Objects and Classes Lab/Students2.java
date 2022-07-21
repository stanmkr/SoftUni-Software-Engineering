package Objects_and_Classes_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_LAB
 * Date: July / 2022
 */
public class Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> listaEstudiantes = new ArrayList<>();
        String comando = scanner.nextLine();
        while (!comando.equals("end")) {
            String[] estudiante = comando.split(" ");
            String nombre = estudiante[0];
            String apellido = estudiante[1];
            String edad = estudiante[2];
            String ciudad = estudiante[3];
            Student student = new Student(nombre, apellido, edad, ciudad);

            listaEstudiantes.add(student);
            comando = scanner.nextLine();
        }
        String ciudad = scanner.nextLine();
        for (Student estudiante : listaEstudiantes) {
            if (estudiante.getCiudad().equals(ciudad)) {
                System.out.println(estudiante);
            }
        }
    }

    static class Student {
        private String nombre, apellidos, edad, ciudad;

        public Student(String nombre, String apellidos, String edad, String ciudad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.ciudad = ciudad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(nombre, student.nombre) && Objects.equals(apellidos, student.apellidos);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre, apellidos);
        }

        @Override
        public String toString() {
            return getNombre() + " " + getApellidos() + " is " + getEdad()+" years old";
        }
    }
}
