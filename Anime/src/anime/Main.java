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
        int aukera;
        int aukera1;
        boolean error, again;
        do {
            error = false;
            again = false;
            Menu.menuMain();
            aukera = Lector.lectorInt();

            switch (aukera) {
                case 1: {
                    Menu.menuAnime();

                    aukera1 = Lector.lectorInt();

                    switch (aukera1) {
                        case 1:
                            Metodo.crearObjectFile("Anime.txt");
//                            anime01.setAnime();
                            break;
                        case 2:
                            Metodo.leerObjectFile("src/anime/Anime.txt");
                            break;
                        case 3:
                            int pos = 0,
                             campo;
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
                }
                case 2: {
                    Menu.menuManga();
                    aukera1 = Lector.lectorInt();

                    switch (aukera1) {
                        case 1:
                            Metodo.crearObjectFile("Manga.txt");
                            break;
                        case 2:
                            Metodo.leerObjectFile("src/anime/Manga.txt");
                            break;
                        case 3:
                            int pos = 0,
                             campo;
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
                }
                case 3: {
                    Menu.menuAutor();
                    aukera1 = Lector.lectorInt();

                    switch (aukera1) {
                        case 1:
                            Metodo.crearObjectFile("Autor.txt");
                            break;
                        case 2:
                            Metodo.leerObjectFile("src/anime/Autor.txt");
                            break;
                        case 3:
                            int pos = 0,
                             campo;
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
                }
                case 4: {
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
                }
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
