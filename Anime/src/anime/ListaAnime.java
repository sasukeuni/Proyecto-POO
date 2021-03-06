package anime;

import java.util.ArrayList;

public class ListaAnime {

    private ArrayList<Anime> animes;

    @SuppressWarnings("unchecked")
    public ListaAnime() {
        animes = new ArrayList<>();
    }

    public void getAnime() {
        for (Anime anime : animes) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("ANIMEAREN IZENA: " + anime.getTitulo());
            System.out.println("ANIMEAREN AUTOREA: " + anime.getAutor());
            System.out.println("ANIMEAREN URTEA: " + anime.getAnno());
            System.out.println("ANIMEAREN KAPITULU KOPURUA: " + anime.getCapitulos());
            System.out.println("ANIMEAREN GENEROA: " + anime.getGenero());
            System.out.println("ANIMEAREN RATINGA : " + anime.getRating());
            System.out.println("ANIMEAREN PUBLIKAZIOA: " + anime.getPublicacion());
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void setAnime() {
        Anime ani = new Anime();
        animes.add(ani);
    }

    public void returnAnime() {
        if (!animes.isEmpty()) {
            for (int i = 0; i <= animes.size() - 1; i++) {
                System.out.println(i + ". " + animes.get(i).getTitulo());
            }
        } else {
            System.out.println("No hay ninguno almacenado");
        }
    }

    public void updateAnime(int objeto, int campo) {
        switch (campo) {
            case 1:
                animes.get(objeto).setTitulo();
                break;
            case 2:
                animes.get(objeto).setAutor();
                break;
            case 3:
                animes.get(objeto).setAnno();
                break;
            case 4:
                animes.get(objeto).setCapitulos();
                break;
            case 5:
                animes.get(objeto).setGenero();
                break;
            case 6:
                animes.get(objeto).setRating();
                break;
            case 7:
                animes.get(objeto).setPublicacion();
                break;
            default:
                break;

        }
    }
// TODO hola 

    public void deleteAnime() {
        Anime ani = new Anime();
        animes.remove(ani);
    }

}
