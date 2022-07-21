package Objects_and_Classes_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_LAB
 * Date: July / 2022
 */
public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> listaCanciones = new ArrayList<>();

        int numeroCanciones = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numeroCanciones; i++) {
            String[] canciones = scanner.nextLine().split("_");
            String inputType = canciones[0];
            String inputName = canciones[1];
            String inputTime = canciones[2];
            listaCanciones.add(new Song(inputType, inputName, inputTime));
        }

        String tipoDeLista = scanner.nextLine();
        for (Song cancion : listaCanciones) {
            if (tipoDeLista.equals("all")){
                System.out.println(cancion.getName());
            }else {
                if (cancion.getTypeList().equals(tipoDeLista)){
                    System.out.println(cancion.getName());
                }
            }
        }

    }


    static class Song {
        private String name, time, typeList;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public String getTypeList() {
            return typeList;
        }

        // SETTERS
        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }
    }
}
