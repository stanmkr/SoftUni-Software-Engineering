package Objects_and_Classes_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articulos = new ArrayList<>();
        int numeroComandos = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numeroComandos; i++) {
            String[] articulo = scanner.nextLine().split(", ");
            String titulo = articulo[0];
            String contenido = articulo[1];
            String autor = articulo[2];
            Article article = new Article(titulo, contenido, autor);
            articulos.add(article);

        }
        String comando = scanner.nextLine();
        if (comando.equals("title") || comando.equals("content") || comando.equals("author")) {
            for (Article articulo : articulos) {
                System.out.println(articulo);
            }
        }

    }

    static class Article {
        private String title, content, author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }


        private void Edit(String contenidoNuevo) {
            this.content = contenidoNuevo;
        }

        private void ChangeAuthor(String autorNuevo) {
            this.author = autorNuevo;
        }


        private void Rename(String tituloNuevo) {
            this.title = tituloNuevo;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }


}
