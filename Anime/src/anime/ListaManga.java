package anime;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ListaManga {

    private static final Logger LOG = Logger.getLogger(ListaManga.class.getName());

    private final ArrayList<Manga> mangas;

    @SuppressWarnings("unchecked")
    public ListaManga() {
        mangas = new ArrayList<>();
    }

    public void getManga() {
        for (Manga manga : mangas) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("MANGAREN IZENA: " + manga.getTitulo());
            System.out.println("MANGAREN AUTOREA: " + manga.getAutor());
            System.out.println("MANGAREN URTEA: " + manga.getAnno());
            System.out.println("MANGAREN KAPITULU KOPURUA: " + manga.getCapitulos());
            System.out.println("MANGAREN GENEROA: " + manga.getGenero());
            System.out.println("MANGAREN RATINGA : " + manga.getRating());
            System.out.println("MANGAREN PUBLIKATZAILEA: " + manga.getPublicadora());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setManga() {
        Manga mng = new Manga();
        mangas.add(mng);
    }

    public void returnManga() {
        for (int i = 0; i < mangas.size(); i++) {
            System.out.println(i + ". " + mangas.get(i).getTitulo());
        }
    }

    public void updateAutor(int objeto, int campo) {

        switch (campo) {
            case 1:
                mangas.get(objeto).setTitulo();
                break;
            case 2:
                mangas.get(objeto).setAutor();
                break;
            case 3:
                mangas.get(objeto).setAnno();
                break;
            case 4:
                mangas.get(objeto).setCapitulos();
                break;
            case 5:
                mangas.get(objeto).setGenero();
                break;
            case 6:
                mangas.get(objeto).setRating();
                break;
            case 7:
                mangas.get(objeto).setPublicadora();
                break;
            default:
                break;

        }
    }
}
