package Objects_and_Classes_Exercises;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Java Fundamentals - Objects_and_Classes_Exercises
 * Date: July / 2022
 */
public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articulo = scanner.nextLine().split(", ");
        String titulo = articulo[0];
        String contenido = articulo[1];
        String autor = articulo[2];

        Article article = new Article(titulo, contenido, autor);

        int numeroComandos = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numeroComandos; i++) {
            String comando = scanner.nextLine();
            String commandName = comando.split("\\: ")[0];
            String nuevoValor = comando.split("\\: ")[1];
            switch (commandName) {
                case "Edit":
                    article.Edit(nuevoValor);
                    break;
                case "ChangeAuthor":
                    article.ChangeAuthor(nuevoValor);
                    break;
                case "Rename":
                    article.Rename(nuevoValor);
                    break;
            }
        }
        System.out.println(article);

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
