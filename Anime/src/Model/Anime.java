package Model;

import anime.Lector;
import java.io.Serializable;

/**
 *
 * @author sasukeuni
 */
public class Anime extends Arte implements Serializable {

    private String adaptacion;

    private String publicacion;

    /**
     *
     * @param titulo
     * @param autor
     * @param anno
     * @param capitulos
     * @param genero
     * @param adaptacion
     * @param rating
     * @param publicacion
     */
    public Anime(String titulo, String autor, String anno, String capitulos, String genero, String adaptacion, String rating, String publicacion) {
        super(titulo, autor, capitulos, genero, rating);
        this.adaptacion = adaptacion;
        this.publicacion = publicacion;
    }

    public Anime() {

        super();
        setAdaptacion();
        setPublicacion();
    }

    public void setAdaptacion(String adaptacion) {
        this.adaptacion = adaptacion;
    }

    public void setPublicacion(String publicacion) {

        this.publicacion = publicacion;
    }

    public String getAdaptacion() {
        return adaptacion;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setAdaptacion() {
        char x;
        System.out.println("Este anime es una adaptacion de algun manga? s/n");
        String siNo = Lector.lector();
        x = siNo.charAt(0);
        if (x == 'S' || x == 's') {
            System.out.println("Cual es el titulo de su procedencia? ");
            adaptacion = Lector.lector();
        } else {
            adaptacion = "Es una serie original";
        }
    }

    public void setPublicacion() {
        System.out.println("Que tipo de publicación ha tenido? (tv, ova(original video animation), ona(original net animation), movie, special");
        publicacion = Lector.lector();
    }
}
