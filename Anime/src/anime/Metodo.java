package anime;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Metodo {

    private static final Logger LOG = Logger.getLogger(Metodo.class.getName());

    @SuppressWarnings("PackageVisibleField")
    static int ejecutado = 0;

    /**
     *
     * @param annoNacimiento
     * @return
     */
    static Integer edad(LocalDate annoNacimiento) {
        LocalDate today = LocalDate.now();
        int edad = 0;
        try {
            edad = today.getYear() - annoNacimiento.getYear();
        } catch (NullPointerException n) {
        }
        return edad;
    }

    static void isVacio(String dato) {
        try {
            if (dato.length() != 0) {
                System.out.println(dato);
                ejecutado++;
            }
        } catch (NullPointerException e) {
        }
    }

    /**
     *
     * @param fichero
     */
    public static void crearObjectFile(String fichero) {
        try {

            for (int i = 0; i < 1; i++) {
                switch (fichero) {
                    case "Anime.txt":
                        FileOutputStream eos = new FileOutputStream("Anime.txt", true);
                        MiObjectOutputStream oos = new MiObjectOutputStream(eos);
                        Anime an = new Anime();
                        oos.writeObject(an);
                        oos.close();
//                        eos.close();
                        break;

                    case "Autor.txt":
                        eos = new FileOutputStream("Autor.txt", true);
                        oos = new MiObjectOutputStream(eos);
                        Autor au = new Autor();
                        oos.writeObject(au);
                        oos.close();
//                        eos.close();
                        break;
                    case "Manga.txt":
                        eos = new FileOutputStream("Manga.txt", true);
                        oos = new MiObjectOutputStream(eos);
                        Manga ma = new Manga();
                        oos.writeObject(ma);
                        oos.close();
//                        eos.close();
                        break;

                }

            }

        } catch (Exception e) {
        }
    }

    /**
     *
     * @param fichero
     */
    public static void leerObjectFile(String fichero) {
        ArrayList<Anime> anime = null;
        ArrayList<Autor> autor = null;
        ArrayList<Manga> manga = null;

        try {
            // Se crea un ObjectInputStream
            FileInputStream eos = new FileInputStream(fichero);
            MiObjectInputStream ois = new MiObjectInputStream(eos);
            switch (fichero) {
                case "Anime.txt":

                    while (eos.read() != -1) {
                        Anime an = (Anime)ois.readObject();
                        anime.add(an);
                        ois.close();
                    }
                    break;
                case "Autor.txt":
                    while (eos.read() != -1) {
                        Autor au = (Autor) ois.readObject();
                        autor.add(au);
                        ois.close();
                    }
                    break;
                case "Manga.txt":
                    while (eos.read() != -1) {
                        Manga ma = (Manga) ois.readObject();
                        manga.add(ma);
                        ois.close();
                    }
                    break;
            }

            // Se lee el primer objeto
            Object aux = ois.readObject();
            int cont = 0;
            // Mientras haya objetos
            while (aux != null) {
                switch (fichero) {
                    case "Anime.txt":
                        if (aux instanceof Anime) {
                            System.out.println(anime.get(cont).getTitulo() + "\n"
                                    + anime.get(cont).getAutor() + "\n"
                                    + anime.get(cont).getCapitulos() + "\n"
                                    + anime.get(cont).getGenero() + "\n"
                                    + anime.get(cont).getAnno() + "\n"
                                    + anime.get(cont).getRating() + "\n"
                                    + anime.get(cont).getPublicacion() + "\n"
                                    + anime.get(cont).getAdaptacion() + "\n");
                        }
                        break;
                    case "Autor.txt":
                        if (aux instanceof Autor) {
                            System.out.println(autor.get(cont).getNombre() + "\n"
                                    + autor.get(cont).getBiografia() + "\n"
                                    + autor.get(cont).getFechaNacimiento() + "\n"
                                    + autor.get(cont).getEdad() + "\n");
                        }
                        break;
                    case "Manga.txt":
                        if (aux instanceof Manga) {
                            System.out.println(manga.get(cont).getTitulo() + "\n"
                                    + manga.get(cont).getAutor() + "\n"
                                    + manga.get(cont).getAutor() + "\n"
                                    + manga.get(cont).getCapitulos() + "\n"
                                    + manga.get(cont).getGenero() + "\n"
                                    + manga.get(cont).getAnno() + "\n"
                                    + manga.get(cont).getRating() + "\n"
                                    + manga.get(cont).getPublicadora() + "\n");
                        }
                        break;
                }
                aux = ois.readObject();
                cont++;
            }
            eos.close();
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (IOException | ClassNotFoundException e2) {
        }

    }

}
