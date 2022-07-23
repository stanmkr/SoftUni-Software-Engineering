package Associative_Arrays_Exercises;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Associative_Arrays_Exercises
 * Date: July / 2022
 */
public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String empresa, empleadoID;
        LinkedHashMap<String, List<String>> companiaRegistro = new LinkedHashMap<>();

        while (!input.equals("End")) {
            empresa = input.split(" -> ")[0];
            empleadoID = input.split(" -> ")[1];
            if (companiaRegistro.containsKey(empresa)) {
                List<String> empleados = companiaRegistro.get(empresa);
                if (!empleados.contains(empleadoID))
                    empleados.add(empleadoID);
            } else {
                List<String> empleados = new ArrayList<>();
                empleados.add(empleadoID);
                companiaRegistro.put(empresa, empleados);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companiaRegistro.entrySet()) {
            System.out.printf("%s%n-- %s%n",entry.getKey(),String.join("\n-- ",entry.getValue()));
        }

//        companiaRegistro.entrySet().stream().sorted(Map.Entry.comparingByKey())
//                .forEach(compania -> {
//                    System.out.println(compania.getKey());
//                    compania.getValue().forEach(entry -> System.out.println("-- " + entry));
//                });

    }
}
