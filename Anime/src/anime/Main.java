package anime;

import java.util.logging.Logger;

/**
 *
 * @author sasukeuni
 */
public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ListaAnime anime01 = new ListaAnime();
        ListaManga manga01 = new ListaManga();
        ListaAutor autor01 = new ListaAutor();
        ListaGenero genero01 = new ListaGenero();
        ListaRating rating01 = new ListaRating();
        int aukera = 0;
        int aukera1 = 0;
        boolean error, again;
        do {
            error = false;
            again = false;
            System.out.println("1. Anime");
            System.out.println("2. Manga");
            System.out.println("3. Autor");
            System.out.println("4. Muestra los datos almacenados");
            System.out.println("5. Salir");

            aukera = Lector.lectorInt();

            switch (aukera) {
                case 1:
                    Menu.menuAnime();

                    aukera1 = Lector.lectorInt();

                    switch (aukera1) {
                        case 1:
                            anime01.setAnime();
                            break;
                        case 2:
                            anime01.returnAnime();
                            break;
                        case 3:
                            int pos = 0,
                             campo = 0;
                            Menu.modificacionAnime();
                            try {
                                pos = Lector.lectorInt();
                            } catch (NumberFormatException e) {
                                System.out.println("Has metido algo que no es un número");
                            }
                            Menu.modSelAnime();

                            campo = Lector.lectorInt();

                            anime01.updateAnime(pos, campo);
                    }
                    break;
                case 2:
                    Menu.menuManga();
                    aukera1 = Lector.lectorInt();

                    switch (aukera1) {
                        case 1:
                            manga01.setManga();
                            break;
                        case 2:
                            manga01.returnManga();
                            break;
                        case 3:
                            int pos = 0,
                             campo = 0;
                            Menu.modificacionManga();
                            try {
                                pos = Lector.lectorInt();
                            } catch (NumberFormatException e) {
                                System.out.println("Has metido algo que no es un número");
                            }
                            Menu.modSelManga();

                            campo = Lector.lectorInt();

                            manga01.updateAutor(pos, campo);
                    }

                    break;
                case 3:
                    Menu.menuAutor();
                    aukera1 = Lector.lectorInt();

                    switch (aukera1) {
                        case 1:
                            autor01.setAutor();
                            break;
                        case 2:
                            autor01.returnAutor();
                            break;
                        case 3:
                            int pos = 0,
                             campo = 0;
                            Menu.modificacionAutor();
                            try {
                                pos = Lector.lectorInt();
                            } catch (NumberFormatException e) {
                                System.out.println("Has metido algo que no es un número");
                            }
                            Menu.modSelAutor();

                            campo = Lector.lectorInt();

                            autor01.updateAutor(pos, campo);
                    }

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
                    System.out.println("Esa opcion no esta entre las seleccionadas");
            }
        } while (error || !again);
    }
}
