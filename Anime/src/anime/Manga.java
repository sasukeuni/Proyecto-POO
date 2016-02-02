package anime;

import java.util.logging.Logger;

public class Manga extends Arte {

    private static final Logger LOG = Logger.getLogger(Manga.class.getName());

    private String publicadora;

    public Manga(String titulo, String autor, String anno, String capitulos, String genero, String rating, String publicadora) {
        super(titulo, autor, capitulos, genero, rating);
        this.publicadora = publicadora;
    }

    public Manga() {
        System.out.println("Dame el titulo: ");
        setTitulo();
        System.out.println("Dame el autor");
        setAutor();
        System.out.println("Dame el año de publicacion del primer capítulo");
        setAnno();
        System.out.println("Dame el numero total de capitulos hasta el momento");
        setCapitulos();
        System.out.println("Dame el géreno primario del manga:");
        setGenero();
        System.out.println("Cual es la edad recomendada de este anime? (G(all ages), pg(children), PG-13, R-17, R+(adult))");
        setRating();
        System.out.println("Donde se publicó?");
        setPublicadora();
    }

    public String getPublicadora() {
        return publicadora;
    }

    public void setPublicadora() {
        publicadora = Metodo.lector();
    }
}
