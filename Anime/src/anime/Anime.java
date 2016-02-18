package anime;

import java.util.logging.Logger;

/**
 *
 * @author sasukeuni
 */
public class Anime extends Arte {

    private static final Logger LOG = Logger.getLogger(Anime.class.getName());

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
        System.out.println("Dame el titulo: ");
        super.setTitulo();
        System.out.println("Dame el autor");
        super.setAutor();
        System.out.println("Dame el año de publicacion del primer capitulo");
        super.setAnno();
        System.out.println("Dame el numero total de capitulos hasta el momento");
        super.setCapitulos();
        System.out.println("Dame el géreno primario del anime:");
        super.setGenero();
        setAdaptacion();
        System.out.println("Cual es la edad recomendada de este anime? (G(all ages), pg(children), PG-13, R-17, R+(adult))");
        super.setRating();
        setPublicacion();
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
            adaptacion = Lector.lector();
        } else {
            adaptacion = "Es una serie original";
        }
    }

    public void setPublicacion() {
        System.out.println("Que tipo de publicación ha tenido? (tv, ova(original video animation), ona(original net animation), movie, special)");
        publicacion = Lector.lector();
    }
}
