package Associative_Arrays_Exercises;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> registroAlumnos = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String curso = input.split(" : ")[0];
            String alumno = input.split(" : ")[1];

            if (!registroAlumnos.containsKey(curso)) {
                registroAlumnos.put(curso, new ArrayList<>());
                registroAlumnos.get(curso).add(alumno);
            } else {
                registroAlumnos.get(curso).add(alumno);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : registroAlumnos.entrySet()) {
            System.out.printf("%s: %d%n-- %s%n",entry.getKey(),entry.getValue().size(),String.join("\n-- ",entry.getValue()));
        }

//        registroAlumnos.entrySet()
//                .forEach(entry -> {
//                    //key: име на курса
//                    //value: списък с хората
//                    //име на курса -> бр. хората
//                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
//                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
//                    //ascending order / нарастващ ред
//                });


    }
}
