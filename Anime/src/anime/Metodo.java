package anime;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Metodo {

    private static int ejecutado = 0;

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
            FileOutputStream eos;
            MiObjectOutputStream oos;
            for (int i = 0; i < 1; i++) {
                switch (fichero) {
                    case "Anime.txt":
                        eos = new FileOutputStream("src/anime/Anime.txt", true);
                        oos = new MiObjectOutputStream(eos);
                        Anime an = new Anime();
                        oos.writeObject(an);
                        oos.close();
                        eos.close();
                        break;

                    case "Autor.txt":
                        eos = new FileOutputStream("src/anime/Autor.txt", true);
                        oos = new MiObjectOutputStream(eos);
                        Autor au = new Autor();
                        oos.writeObject(au);
                        oos.close();
                        eos.close();
                        break;
                    case "Manga.txt":
                        eos = new FileOutputStream("src/anime/Manga.txt", true);
                        oos = new MiObjectOutputStream(eos);
                        Manga ma = new Manga();
                        oos.writeObject(ma);
                        oos.close();
                        eos.close();
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
        ArrayList<Anime> animeL = null;
        ArrayList<Autor> autorL = null;
        ArrayList<Manga> mangaL = null;

        try {
            // Se crea un ObjectInputStream
            FileInputStream eos = new FileInputStream(fichero);
            MiObjectInputStream ois = new MiObjectInputStream(eos);
            switch (fichero) {
                case "src/anime/Anime.txt":

                    while (eos.read() != -1) {
                        Anime an = (Anime) ois.readObject();
                        animeL.add(an);
                        ois.close();
                    }
                    break;
                case "src/anime/Autor.txt":
                    while (eos.read() != -1) {
                        Autor au = (Autor) ois.readObject();
                        autorL.add(au);
                        ois.close();
                    }
                    break;
                case "src/anime/Manga.txt":
                    while (eos.read() != -1) {
                        Manga ma = (Manga) ois.readObject();
                        mangaL.add(ma);
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
                            System.out.println(animeL.get(cont).getTitulo() + "\n"
                                    + animeL.get(cont).getAutor() + "\n"
                                    + animeL.get(cont).getCapitulos() + "\n"
                                    + animeL.get(cont).getGenero() + "\n"
                                    + animeL.get(cont).getAnno() + "\n"
                                    + animeL.get(cont).getRating() + "\n"
                                    + animeL.get(cont).getPublicacion() + "\n"
                                    + animeL.get(cont).getAdaptacion() + "\n");
                        }
                        break;
                    case "Autor.txt":
                        if (aux instanceof Autor) {
                            System.out.println(autorL.get(cont).getNombre() + "\n"
                                    + autorL.get(cont).getBiografia() + "\n"
                                    + autorL.get(cont).getFechaNacimiento() + "\n"
                                    + autorL.get(cont).getEdad() + "\n");
                        }
                        break;
                    case "Manga.txt":
                        if (aux instanceof Manga) {
                            System.out.println(mangaL.get(cont).getTitulo() + "\n"
                                    + mangaL.get(cont).getAutor() + "\n"
                                    + mangaL.get(cont).getAutor() + "\n"
                                    + mangaL.get(cont).getCapitulos() + "\n"
                                    + mangaL.get(cont).getGenero() + "\n"
                                    + mangaL.get(cont).getAnno() + "\n"
                                    + mangaL.get(cont).getRating() + "\n"
                                    + mangaL.get(cont).getPublicadora() + "\n");
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
