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
        for (int i = 0; i < mangas.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("MANGAREN IZENA: " + mangas.get(i).getTitulo());
            System.out.println("MANGAREN AUTOREA: " + mangas.get(i).getAutor());
            System.out.println("MANGAREN URTEA: " + mangas.get(i).getAnno());
            System.out.println("MANGAREN KAPITULU KOPURUA: " + mangas.get(i).getCapitulos());
            System.out.println("MANGAREN GENEROA: " + mangas.get(i).getGenero());
            System.out.println("MANGAREN RATINGA : " + mangas.get(i).getRating());
            System.out.println("MANGAREN PUBLIKATZAILEA: " + mangas.get(i).getPublicadora());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setManga() {
        Manga mng = new Manga();
        mangas.add(mng);
    }
}
