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
}
