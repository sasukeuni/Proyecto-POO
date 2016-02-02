package anime;


import java.util.ArrayList;

public class ListaAnime {

    private ArrayList<Anime> animes;

    public ListaAnime() {
        animes = new ArrayList();
    }

    public void getAnime() {
        for (int i = 0; i < animes.size(); i++) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("ANIMEAREN IZENA: " + animes.get(i).getTitulo());
            System.out.println("ANIMEAREN AUTOREA: " + animes.get(i).getAutor());
            System.out.println("ANIMEAREN URTEA: " + animes.get(i).getAnno());
            System.out.println("ANIMEAREN KAPITULU KOPURUA: " + animes.get(i).getCapitulos());
            System.out.println("ANIMEAREN GENEROA: " + animes.get(i).getGenero());
            System.out.println("ANIMEAREN RATINGA : " + animes.get(i).getRating());
            System.out.println("ANIMEAREN PUBLIKAZIOA: " + animes.get(i).getPublicacion());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void newAnime() {
        Anime ani = new Anime();
        animes.add(ani);
    }
}
