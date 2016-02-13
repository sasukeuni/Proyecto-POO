package anime;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ListaAnime anime01 = new ListaAnime();
        ListaManga manga01 = new ListaManga();
        ListaAutor autor01 = new ListaAutor();
        ListaGenero genero01 = new ListaGenero();
        ListaRating rating01 = new ListaRating();
        int aukera = 0;
        boolean error, again;
        do {
            error = false;
            again = false;
            System.out.println("1. Anime");
            System.out.println("2. Manga");
            System.out.println("3. Autor");
            System.out.println("4. Muestra los datos almacenados");
            System.out.println("5. Salir");
            try {
                aukera = Integer.parseInt(Metodo.lector());
            } catch (NumberFormatException e) {
                System.out.println("Has metido algo que no es un número");
            }
            switch(aukera) {
                case 1:
                    anime01.setAnime();
                    break;
                case 2:
                    manga01.setManga();
                    break;
                case 3:
                    autor01.setAutor();
                    break;
                case 4:
                    try {
                        System.out.println("\nLos datos almacenados son los siguientes: \n");
                        anime01.getAnime();
                        manga01.getManga();
                        autor01.getAutor();
                        genero01.getGenero();
                        rating01.getRating();
                    } catch (NullPointerException n) {
                    }
                    break;
                case 5:
                    again = true;
                    break;
                default:
                    error = true;
                    System.out.println("try again");
            }
        } while (error || !again);
    }
}
