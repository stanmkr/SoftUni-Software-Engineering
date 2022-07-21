package Objects_and_Classes_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class VehicleCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehiculo> vehiculos = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String tipo = command.split(" ")[0];
            String modelo = command.split(" ")[1];
            String color = command.split(" ")[2];
            int caballos = Integer.parseInt(command.split(" ")[3]);
            vehiculos.add(new Vehiculo(tipo, modelo, color, caballos));
            command = scanner.nextLine();
        }


        String modelos = scanner.nextLine();
        while (!modelos.equals("Close the Catalogue")) {
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getModelo().equals(modelos)) {
                    System.out.println(vehiculo);
                    break;
                }
            }
            modelos = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", caballosMedia(vehiculos, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", caballosMedia(vehiculos, "trucks"));


    }

    private static double caballosMedia(List<Vehiculo> vehiculos, String tipo) {
        double suma = 0;
        double contador = 0;
        if (tipo.equals("cars")) {
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getTipo().equals("car")) {
                    suma += vehiculo.getCaballos();
                    contador++;
                }
            }
        } else if (tipo.equals("trucks")) {
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getTipo().equals("truck")) {
                    suma += vehiculo.getCaballos();
                    contador++;
                }
            }
        }

        if (suma == 0) {
            return 0;
        }
        return suma/contador;
    }

    static class Vehiculo {
        private String tipo, modelo, color;
        private int caballos;

        public Vehiculo(String tipo, String modelo, String color, int caballos) {
            this.tipo = tipo;
            this.modelo = modelo;
            this.color = color;
            this.caballos = caballos;
        }


        public String getTipo() {
            return this.tipo;
        }

        public String getModelo() {
            return this.modelo;
        }

        public String getColor() {
            return this.color;
        }

        public int getCaballos() {
            return caballos;
        }


        @Override
        public String toString() {
            String tipoFormateado = "";
            if (this.tipo.equals("car")) {
                tipoFormateado = "Car";
            } else if (this.tipo.equals("truck")) {
                tipoFormateado = "Truck";
            }
            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d", tipoFormateado, this.modelo, this.color, this.caballos);
        }
    }


}
